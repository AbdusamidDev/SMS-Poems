package developer.abdusamid.sherlar

import Adapter.SherAdapter
import Models.Sher
import Models.SherListObject
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.dialog_view.view.*
import kotlinx.android.synthetic.main.fragment_list.view.*

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ListFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    lateinit var root: View

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        root = inflater.inflate(R.layout.fragment_list, container, false)

        root.btn_back.setOnClickListener {
            root.findNavController().popBackStack()
        }

        val n = arguments?.getInt("key0")

        when (n) {
            0 -> {
                root.txtsher_turi.text = "SEVGI \nSHE'RLARI"
                root.rv_list.adapter = SherAdapter(
                    SherListObject.sevgiList,
                    object : SherAdapter.OnMyItemClickListener {
                        override fun onMyItemClck(sher: Sher, position: Int) {
                            dialogShow(sher)
                        }

                    })
            }
            1 -> {
                root.txtsher_turi.text = "SOG'INCH \nSHE'RLARI"
                root.rv_list.adapter = SherAdapter(
                    SherListObject.soginchList,
                    object : SherAdapter.OnMyItemClickListener {
                        override fun onMyItemClck(sher: Sher, position: Int) {
                            dialogShow(sher)
                        }

                    })
            }
            2 -> {
                root.txtsher_turi.text = "TABRIK \nSHE'RLARI"
                root.rv_list.adapter = SherAdapter(
                    SherListObject.tabrikList,
                    object : SherAdapter.OnMyItemClickListener {
                        override fun onMyItemClck(sher: Sher, position: Int) {
                            dialogShow(sher)
                        }

                    })
            }
            3 -> {
                root.txtsher_turi.text = "OTA-ONA \nHAQIDA"
                root.rv_list.adapter = SherAdapter(
                    SherListObject.sevgiList,
                    object : SherAdapter.OnMyItemClickListener {
                        override fun onMyItemClck(sher: Sher, position: Int) {
                            dialogShow(sher)
                        }

                    })
            }
            4 -> {
                root.txtsher_turi.text = "DO'STLIK \nSHE'RLARI"
                root.rv_list.adapter = SherAdapter(
                    SherListObject.dostlikList,
                    object : SherAdapter.OnMyItemClickListener {
                        override fun onMyItemClck(sher: Sher, position: Int) {
                            dialogShow(sher)
                        }

                    })
            }
            5 -> {
                root.txtsher_turi.text = "HAZIL \nSHE'RLARI"
                root.rv_list.adapter = SherAdapter(
                    SherListObject.hazilList,
                    object : SherAdapter.OnMyItemClickListener {
                        override fun onMyItemClck(sher: Sher, position: Int) {
                            dialogShow(sher)
                        }

                    })
            }
            6 -> {
                root.txtsher_turi.text = "YANGI \nSHE'RLARI"
                root.rv_list.adapter = SherAdapter(
                    SherListObject.yangilarList,
                    object : SherAdapter.OnMyItemClickListener {
                        override fun onMyItemClck(sher: Sher, position: Int) {
                            dialogShow(sher)
                        }

                    })
            }
            7 -> {
                root.txtsher_turi.text = "SAQLANGAN \nSHE'RLARI"
                root.rv_list.adapter = SherAdapter(
                    SherListObject.saqlanganList,
                    object : SherAdapter.OnMyItemClickListener {
                        override fun onMyItemClck(sher: Sher, position: Int) {
                            dialogShow(sher)
                        }

                    },
                    1
                )
            }
        }

        return root
    }

    @SuppressLint("InflateParams")
    fun dialogShow(sher: Sher) {
        val alerdDialog = BottomSheetDialog(root.context, R.style.NewDialog)
        val viewDialog =
            LayoutInflater.from(root.context).inflate(R.layout.dialog_view, null, false)

        viewDialog.txt_dialog_name.text = sher.name
        viewDialog.txt_dialog_text.text = sher.matni

        alerdDialog.setContentView(viewDialog)
        alerdDialog.show()
    }
}