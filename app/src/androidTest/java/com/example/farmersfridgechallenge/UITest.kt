package com.example.farmersfridgechallenge

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class UITest {

    @Rule
    @JvmField
    var activityRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun UI() {

        // First Set of values
        onView(withId(R.id.editText)).perform(click(), replaceText("JZ MHSQ KMZLZ KUFKML KH XZ LZSA-ZPEQZVK, KMDK DSS NZV DUZ IUZDKZQ ZRFDS, KMDK KMZR DUZ ZVQHJZQ XR KMZEU IUZDKHU JEKM IZUKDEV FVDSEZVDXSZ UEWMKL, KMDK DNHVW KMZLZ DUZ SEAZ, SEXZUKR DVQ KMZ CFULFEK HA MDCCEVZLL. â?? KMDK KH LZIFUZ KMZLZ UEWMKL, WHPZUVNZVKL DUZ EVLKEKFKZQ DNHVW NZV, QZUEPEVW KMZEU BFLK CHJZUL AUHN KMZ IHVLZVK HA KMZ WHPZUVZQ, â?? KMDK JMZVZPZU DVR AHUN HA WHPZUVNZVK XZIHNZL QZLKUFIKEPZ HA KMZLZ ZVQL, EK EL KMZ UEWMK HA KMZ CZHCSZ KH DSKZU HU KH DXHSELM EK, DVQ KH EVLKEKFKZ VZJ WHPZUVNZVK, SDREVW EKL AHFVQDKEHV HV LFIM CUEVIECSZL DVQ HUWDVEGEVW EKL CHJZUL EV LFIM AHUN, DL KH KMZN LMDSS LZZN NHLK SEYZSR KH ZAAZIK KMZEU LDAZKR DVQ MDCCEVZLL. CUFQZVIZ, EVQZZQ, JESS QEIKDKZ KMDK WHPZUVNZVKL SHVW ZLKDXSELMZQ LMHFSQ VHK XZ IMDVWZQ AHU SEWMK DVQ KUDVLEZVK IDFLZL; DVQ DIIHUQEVWSR DSS ZOCZUEZVIZ MDKM LMZJV KMDK NDVYEVQ DUZ NHUZ QELCHLZQ KH LFAAZU, JMESZ ZPESL DUZ LFAAZUDXSZ KMDV KH UEWMK KMZNLZSPZL XR DXHSELMEVW KMZ AHUNL KH JMEIM KMZR DUZ DIIFLKHNZQ. XFK JMZV D SHVW KUDEV HA DXFLZL DVQ FLFUCDKEHVL, CFULFEVW EVPDUEDXSR KMZ LDNZ HXBZIK ZPEVIZL D QZLEWV KH UZQFIZ KMZN FVQZU DXLHSFKZ QZLCHKELN, EK EL KMZEU UEWMK, EK EL KMZEU QFKR, KH KMUHJ HAA LFIM WHPZUVNZVK, DVQ KH CUHPEQZ VZJ WFDUQL AHU KMZEU AFKFUZ LZIFUEKR. â?? LFIM MDL XZZV KMZ CDKEZVK LFAAZUDVIZ HA KMZLZ IHSHVEZL; DVQ LFIM EL VHJ KMZ VZIZLLEKR JMEIM IHVLKUDEVL KMZN KH DSKZU KMZEU AHUNZU LRLKZNL HA WHPZUVNZVK. KMZ MELKHUR HA KMZ CUZLZVK YEVW HA WUZDK XUEKDEV EL D MELKHUR HA UZCZDKZQ EVBFUEZL DVQ FLFUCDKEHVL, DSS MDPEVW EV QEUZIK HXBZIK KMZ ZLKDXSELMNZVK HA DV DXLHSFKZ KRUDVVR HPZU KMZLZ LKDKZL. KH CUHPZ KMEL, SZK ADIKL XZ LFXNEKKZQ KH D IDVQEQ JHUSQ"),
            pressImeActionButton())
        Thread.sleep(5000)
        onView(withId(R.id.recyclerView)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(10, click()))
        Thread.sleep(5000)

        // Second set of values
        onView(withId(R.id.editText)).perform(click(), replaceText(
                "JZ, KMZUZAHUZ, KMZ UZCUZLZVKDKEPZL HA KMZ FVEKZQ LKDKZL HA DNZUEID, EV WZVZUDS IHVWUZLL, DLLZNXSZQ, DCCZDSEVW KH KMZ LFCUZNZ BFQWZ HA KMZ JHUSQ AHU KMZ UZIKEKFQZ HA HFU EVKZVKEHVL, QH, EV KMZ VDNZ, DVQ XR DFKMHUEKR HA KMZ WHHQ CZHCSZ HA KMZLZ IHSHVEZL, LHSZNVSR CFXSELM DVQ QZISDUZ, KMDK KMZLZ FVEKZQ IHSHVEZL DUZ, DVQ HA UEWMK HFWMK KH XZ AUZZ DVQ EVQZCZVQZVK LKDKZL, KMDK KMZR DUZ DXLHSPZQ AUHN DSS DSSZWEDVIZ KH KMZ XUEKELM IUHJV, DVQ KMDK DSS CHSEKEIDS IHVVZIKEHV XZKJZZV KMZN DVQ KMZ LKDKZ HA WUZDK XUEKDEV, EL DVQ HFWMK KH XZ KHKDSSR QELLHSPZQ; DVQ KMDK DL AUZZ DVQ EVQZCZVQZVK LKDKZL, KMZR MDPZ AFSS CHJZU KH SZPR JDU, IHVISFQZ CZDIZ, IHVKUDIK DSSEDVIZL, ZLKDXSELM IHNNZUIZ, DVQ KH QH DSS HKMZU DIKL DVQ KMEVWL JMEIM EVQZCZVQZVK LKDKZL NDR HA UEWMK QH. â?? DVQ AHU KMZ LFCCHUK HA KMEL QZISDUDKEHV, JEKM D AEUN UZSEDVIZ HV KMZ CUHKZIKEHV HA QEPEVZ CUHPEQZVIZ, JZ NFKFDSSR CSZQWZ KH ZDIM HKMZU HFU SEPZL, HFU AHUKFVZL, DVQ HFU LDIUZQ MHVHU."))
        Thread.sleep(5000)
        onView(withId(R.id.recyclerView)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(100, click()))
        Thread.sleep(5000)
    }
}