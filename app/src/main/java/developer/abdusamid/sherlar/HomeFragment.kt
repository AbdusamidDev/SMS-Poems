package developer.abdusamid.sherlar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_home.view.*

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class HomeFragment : Fragment() {
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
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        root = inflater.inflate(R.layout.fragment_home, container, false)

        root.card_sevgi.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("key0", 0)
            root.findNavController().navigate(R.id.listFragment, bundle)
        }
        root.card_soginch.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("key0", 1)
            root.findNavController().navigate(R.id.listFragment, bundle)
        }
        root.card_tabrik.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("key0", 2)
            root.findNavController().navigate(R.id.listFragment, bundle)
        }
        root.card_ota_ona.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("key0", 3)
            root.findNavController().navigate(R.id.listFragment, bundle)
        }
        root.card_dostlik.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("key0", 4)
            root.findNavController().navigate(R.id.listFragment, bundle)
        }
        root.card_hazil.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("key0", 5)
            root.findNavController().navigate(R.id.listFragment, bundle)
        }
        root.card_1.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("key0", 6)
            root.findNavController().navigate(R.id.listFragment, bundle)
        }
        root.card_2.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("key0", 7)
            root.findNavController().navigate(R.id.listFragment, bundle)
        }
        return root
    }
}