# 🍔 Compose Delivery - Projeto de Estudos

Este é um projeto desenvolvido para fins de aprendizado, focado em explorar os recursos modernos do **Jetpack Compose** no ecossistema Android. O objetivo principal foi implementar um fluxo de um app de delivery, desde o login até a visualização detalhada de produtos.

## 🚀 Tecnologias e Conceitos Praticados

- **[Kotlin](https://kotlinlang.org/):** Linguagem base do projeto.
- **[Jetpack Compose](https://developer.android.com/jetpack/compose):** Construção de interface declarativa.
- **[Material Design 3](https://m3.material.io/):** Utilização de componentes modernos, cores e tipografia do Material You.
- **[Navigation Compose](https://developer.android.com/jetpack/compose/navigation):** Gerenciamento de rotas e passagem de argumentos dinâmicos entre telas.
- **[ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel):** Gerenciamento de estado e lógica de negócio separada da UI.
- **[Coil](https://coil-kt.github.io/coil/):** Carregamento de imagens assíncronas via URL.
- **[Sealed Classes](https://kotlinlang.org/docs/sealed-classes.html):** Implementação de um padrão de `Result` para tratamento de validações de forma segura e idiomática.

## 📱 Funcionalidades

- **Tela de Login:** 
    - Validação de campos (Nome, Email e Senha).
    - Tratamento de erros em tempo real com mensagens via Toast.
- **Lista de Produtos (Home):**
    - Exibição de produtos consumindo um Mock local.
    - Layout "Flat" moderno com `LazyColumn` para alta performance.
- **Detalhes do Produto:**
    - Navegação dinâmica baseada no ID do produto.
    - Exibição de imagem em destaque, descrição e preço.

## 🛠️ Estrutura do Projeto

```
src/main/java/.../compose_example/
├── model/        # Data classes (Product, CartItem) e Sealed Classes (Result)
├── pages/        # Telas completas (LoginPage, HomePage, ProductDetailsPage)
├── ui/           # Temas e componentes reutilizáveis (ProductCard)
├── viewmodel/    # Lógica de negócio e persistência de estado de UI
├── routes/       # Configuração do NavHost (AppNavigation)
└── validators/   # Lógica pura de validação de dados
```

## ⚙️ Como executar o projeto

1. Certifique-se de ter o **Android Studio (Ladybug ou superior)** instalado.
2. Clone este repositório:
   
```sh
git clone https://github.com/seu-usuario/compose-example.git
```

3. Abra o projeto no Android Studio.
4. Aguarde a sincronização do Gradle (necessário conexão com a internet para baixar as bibliotecas como Coil e Navigation).
5. Execute o app em um emulador ou dispositivo físico com **API 24+**.

---

## ✍️ Autor

Desenvolvido por **Murilo Furlaneto** como parte de uma jornada de especialização em desenvolvimento Android Moderno.
