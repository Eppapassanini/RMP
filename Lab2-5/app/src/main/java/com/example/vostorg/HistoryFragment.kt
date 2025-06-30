package com.example.vostorg

import android.os.Bundle
import androidx.fragment.app.Fragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HistoryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HistoryFragment : BaseActivityListFragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun getActivityList(): List<ActivityListItem> = listOf(
        ActivityListItem.Section("Вчера"),
        ActivityListItem.Activity(
            distance = "14.32 км",
            duration = "2 часа 46 минут",
            type = "Серфинг 🏄‍♂️",
            user = "@van_darkholme",
            timeAgo = "14 часов назад"
        ),
        ActivityListItem.Activity(
            distance = "228 м",
            duration = "14 часов 48 минут",
            type = "Качели",
            user = "@techniquepasha",
            timeAgo = "14 часов назад"
        ),
        ActivityListItem.Activity(
            distance = "10 км",
            duration = "1 час 10 минут",
            type = "Езда на кадилак",
            user = "@morgen_shtern",
            timeAgo = "14 часов назад"
        )
    )

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HistoryFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HistoryFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}