# 🍔 Compose Delivery - Projeto de Estudos

Este é um projeto desenvolvido para fins de aprendizado, focado em explorar os recursos modernos do **Jetpack Compose** no ecossistema Android, agora estruturado seguindo os princípios da **Clean Architecture**.

## 🚀 Tecnologias e Conceitos Praticados

- **[Kotlin](https://kotlinlang.org/):** Linguagem base do projeto.
- **[Jetpack Compose](https://developer.android.com/jetpack/compose):** Construção de interface declarativa.
- **[Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html):** Separação de responsabilidades em camadas (Domain, Data, Presentation).
- **[Material Design 3](https://m3.material.io/):** Componentes modernos e design "Flat".
- **[Navigation Compose](https://developer.android.com/jetpack/compose/navigation):** Gerenciamento de rotas e argumentos dinâmicos.
- **[ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel):** Persistência de estado de UI.
- **[Coil](https://coil-kt.github.io/coil/):** Carregamento de imagens assíncronas.

## 📱 Funcionalidades

- **Autenticação:** Validação de login via UseCase especializado.
- **Catálogo:** Listagem de produtos consumindo um repositório (Mock).
- **Detalhes:** Visualização profunda de cada item com navegação dinâmica.

## 🛠️ Estrutura do Projeto (Clean Architecture)

```
src/main/java/.../compose_example/
├── domain/           # Camada de Negócio (Independente)
│   ├── model/        # Modelos de dados (Product, Result)
│   ├── repository/   # Interfaces de repositório
│   └── usecase/      # Casos de uso (LoginUseCase, GetProductsUseCase)
├── data/             # Camada de Implementação
│   └── repository/   # Implementação real dos repositórios
├── presentation/     # Camada de Interface (Compose)
│   ├── login/        # Feature de Login (Page + ViewModel)
│   ├── home/         # Feature de Catálogo (Page + ViewModel)
│   └── details/      # Feature de Detalhes
├── ui/               # Temas e componentes comuns (ProductCard)
└── routes/           # Navegação Centralizada (AppNavigation)
```

## ⚙️ Como executar o projeto

1. Android Studio **Ladybug** ou superior.
2. Clone o repositório.
3. Sync Gradle e execute em um dispositivo **API 24+**.

---

## ✍️ Autor

Desenvolvido por **Murilo Furlaneto** - Jornada de especialização em Android Moderno.
