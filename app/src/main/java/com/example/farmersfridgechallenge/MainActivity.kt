package com.example.farmersfridgechallenge

import android.app.Activity
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.stream.Collectors.toList

class MainActivity : AppCompatActivity() {

    val TAG = javaClass.simpleName

    val removePZL = "A"
    val removeEZL = "R"
    lateinit var mainAdapter: MainAdapter

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create click Listener for edit text
       editText.setOnEditorActionListener { v, actionId, event ->

           // Changes functionality of return button on softKeyboard (to done)
           if (actionId == EditorInfo.IME_ACTION_DONE) {

               // if editext is not null
               if (editText != null) {

                   // set user input to equal value in edit text
                   var userInput = editText.text.toString()

                   // filter list that was entered into edit text
                   filterResults(userInput)

                   // and remove keyboard
                   hideKeyboard()
               } else{

                   // else display message showing for use to enter information into edit text field
                   Toast.makeText(this,"Please enter a value in the edit text",Toast.LENGTH_LONG).show()
               }

           }
            true
       }

    }

    // Hide Soft Keyboard
    private fun hideKeyboard() {

        // Get system service associated with keyboard and take it out of focuse
        val inputMethodManger = this.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManger.hideSoftInputFromWindow(this.currentFocus?.windowToken,0)
    }

    private fun filterResults(userInput: String) {

        // Split user input into array based on empty space
        var inputToArray = userInput.split(" ")

        // Initialize array
        var unfilteredInput = ArrayList<String>()

        // Loop through array
        for (i in inputToArray.indices) {

            // Add value to array
            unfilteredInput.add(inputToArray[i])
        }

        // Loop through Array
        for (i in unfilteredInput.indices) {

            // If the array in the unfilted array is greater than 2
            if (unfilteredInput.get(i).length > 2) {

                /*
                * Next three lines of code basically find the letters at the end of each items based on
                * the length of the items in the word.
                *
                * Example:
                *
                * superman
                *
                * tempThreeLetterWordFinder = man
                * tempTwoLetterWordFinder = an
                * tempOneLetterWordFinder = n
                */
                var tempThreeLetterWordFinder = unfilteredInput.get(i).substring(unfilteredInput.get(i).length - 3, unfilteredInput.get(i).length)
                var tempTwoLetterWordfinder = unfilteredInput.get(i).substring(unfilteredInput.get(i).length-2, unfilteredInput.get(i).length)
                var tempOneLetterWordFinder = unfilteredInput.get(i).substring(unfilteredInput.get(i).length-1,unfilteredInput.get(i).length)


                /*
                * The next three lines of code represent the root word based on the number of items at the end of
                * the word
                */
                var tempRootWordThreeLetterUpdate = unfilteredInput.get(i).substring(0, unfilteredInput.get(i).length - 3)
                var tempRootWordTwoLetterUpdate = unfilteredInput.get(i).substring(0,unfilteredInput.get(i).length-2)
                var tempRootWordOneLetterUpdate = unfilteredInput.get(i).substring(0,unfilteredInput.get(i).length-1)

                // if the last three letters in word equals PZL
                if (tempThreeLetterWordFinder.equals("PZL")) {

                    // find and replace PZL
                    unfilteredInput.set(i, tempRootWordThreeLetterUpdate + removePZL)
                } else if (tempThreeLetterWordFinder.equals("EZL")){

                    // find and replace EZL
                    unfilteredInput.set(i, tempRootWordThreeLetterUpdate+removeEZL)
                } else if (tempThreeLetterWordFinder.equals("EVM")) {

                    //find and replace EVM
                    unfilteredInput.set(i, tempRootWordThreeLetterUpdate)

                    // If last 2 letters in word equals LZ
                } else if (tempTwoLetterWordfinder.equals("LZ") || tempTwoLetterWordfinder.equals("ZQ")) {

                    // find and remove LZ and ZQ
                    unfilteredInput.set(i, tempRootWordTwoLetterUpdate)
                } else if (tempOneLetterWordFinder.equals("L")) {

                    // find and remove L
                    unfilteredInput.set(i,tempRootWordOneLetterUpdate)
                }
            }
        }

        // Set up RecyclerView
        setupRecyclerView(unfilteredInput)
    }

    private fun setupRecyclerView(unfilteredInput: java.util.ArrayList<String>) {

        // Initiate HashMap with String and Int
        var filteredNumberedList = HashMap<String,Int>()

        // Loop through unfiltered List
        for (i in unfilteredInput) {

            /*
            * Add data from unfiltered list to filtered list and keep counter of number. Duplicate are not
            * added to hashmap
            */
            filteredNumberedList.put(i, filteredNumberedList.getOrDefault(i,0)+1)
        }


        // Convert items in hash map to 2 seperate arrays one for updated words and the other for number of times updated words have been used
        var word = filteredNumberedList.keys.stream().collect(toList())
        var numberCount = filteredNumberedList.values.stream().collect(toList())



        // Set up adapter to display list of updated words and number count
        mainAdapter = MainAdapter(word as ArrayList<String>,numberCount as ArrayList<Int>)
        recyclerView.apply {

            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = mainAdapter
        }

    }
}