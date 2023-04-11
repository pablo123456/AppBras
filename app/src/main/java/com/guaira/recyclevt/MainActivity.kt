package com.guaira.recyclevt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.guaira.recyclevt.Adapter.AdapterProduto
import com.guaira.recyclevt.model.Produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // supportActionBar!!.hide()
        val recyclerview_produto = findViewById<RecyclerView>(R.id.recyclerview_produtos)
        recyclerview_produto.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerview_produto.setHasFixedSize(true)
        //configurar o adapter
        val listaProdutos: MutableList<Produto> = mutableListOf()
        val adapterProduto = AdapterProduto(this,listaProdutos)
        recyclerview_produto.adapter = adapterProduto

        val produto1 = Produto(
            R.drawable.exemplo,
            "Exemplo",
            "ksafjasfhkafjjjfaskjfakjfjkafsjkfajskjfkasjkaf",
            "R$ 40,000"
        )
        listaProdutos.add(produto1)
        val produto2 = Produto(
            R.drawable.exemplo,
            "Exemplo2",
            "ksafjasfhkafjjjfaskjfakjfjkafsjkfajskjfkasjkaf",
            "R$ 400,000"
        )
        listaProdutos.add(produto2)
        val produto3 = Produto(
            R.drawable.exemplo,
            "Exemplo3",
            "ksafjasfhkafjjjfaskjfakjfjkafsjkfajskjfkasjkaf",
            "R$ 600,000"
        )
        listaProdutos.add(produto3)
    }
}