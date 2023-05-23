package br.senai.sp.jandira.lista.dao.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import br.senai.sp.jandira.lista.R
import br.senai.sp.jandira.lista.model.Product

class ProductRepository {
    var teste = "Teste"
    companion object{
        @Composable
        fun getProductList(): List<Product>{
            return listOf<Product>(
                Product(
                    id = 1,
                    name = "Mouse",
                    price = 29.99,
                    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
                ),
                Product(
                    id = 2,
                    name = "Teclado",
                    price = 22.0,
                    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
                ),
                Product(
                    id = 3,
                    name = "Mickey Mouse",
                    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
                ),
                Product(
                    id = 4,
                    name = "Caneca Java",
                    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                    image = painterResource(id = R.drawable.caneca_java)
                ),
                Product(
                    id = 5,
                    name = "Camiseta JavaScript",
                    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                    image = painterResource(id = R.drawable.camisa_js)
                ),
                Product(
                    id = 6,
                    name = "teclado",
                    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
                ),
                Product(
                    id = 7,
                    name = "Fone",
                    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
            ),
                Product(
                    id = 8,
                    name = "mesa",
                    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
                ),
                Product(
                    id = 9,
                    name = "Garrafa Gamer",
                    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
                )

            )
        }
    }
}