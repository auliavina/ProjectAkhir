package com.example.appaudittidansisteminformasi.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.appaudittidansisteminformasi.DetailMateriMainActivity
import com.example.appaudittidansisteminformasi.R
import com.example.appaudittidansisteminformasi.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val topik1: TextView = root.findViewById(R.id.topik1)
        val topik2: TextView = root.findViewById(R.id.topik2)
        val topik3: TextView = root.findViewById(R.id.topik3)
        val topik4: TextView = root.findViewById(R.id.topik4)
        val topik5: TextView = root.findViewById(R.id.topik5)
        val topik6: TextView = root.findViewById(R.id.topik6)
        val topik7: TextView = root.findViewById(R.id.topik7)
        val topik8: TextView = root.findViewById(R.id.topik8)
        val topik9: TextView = root.findViewById(R.id.topik9)
        val topik10: TextView = root.findViewById(R.id.topik10)
        val topik11: TextView = root.findViewById(R.id.topik11)
        val topik12: TextView = root.findViewById(R.id.topik12)


        topik1.setOnClickListener{
            val intent = Intent(context, DetailMateriMainActivity::class.java)
            startActivity(intent)
        }

        topik2.setOnClickListener{
            val intent = Intent(context, DetailMateriMainActivity::class.java)
            startActivity(intent)
        }

        topik3.setOnClickListener{
            val intent = Intent(context, DetailMateriMainActivity::class.java)
            startActivity(intent)
        }

        topik4.setOnClickListener{
            val intent = Intent(context, DetailMateriMainActivity::class.java)
            startActivity(intent)
        }

        topik5.setOnClickListener{
            val intent = Intent(context, DetailMateriMainActivity::class.java)
            startActivity(intent)
        }

        topik6.setOnClickListener{
            val intent = Intent(context, DetailMateriMainActivity::class.java)
            startActivity(intent)
        }

        topik7.setOnClickListener{
            val intent = Intent(context, DetailMateriMainActivity::class.java)
            startActivity(intent)
        }


        topik8.setOnClickListener{
            val intent = Intent(context, DetailMateriMainActivity::class.java)
            startActivity(intent)
        }

        topik9.setOnClickListener{
            val intent = Intent(context, DetailMateriMainActivity::class.java)
            startActivity(intent)
        }

        topik10.setOnClickListener{
            val intent = Intent(context, DetailMateriMainActivity::class.java)
            startActivity(intent)
        }

        topik11.setOnClickListener{
            val intent = Intent(context, DetailMateriMainActivity::class.java)
            startActivity(intent)
        }

        topik12.setOnClickListener{
            val intent = Intent(context, DetailMateriMainActivity::class.java)
            startActivity(intent)
        }






        return root

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}