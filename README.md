# 🇬🇧 App Inglés - Aplicación Educativa Interactiva 🚀

[![Android](https://img.shields.io/badge/Platform-Android-green.svg?style=for-the-badge&logo=android)](https://www.android.com/)
[![Java](https://img.shields.io/badge/Language-Java-orange.svg?style=for-the-badge&logo=openjdk)](https://www.java.com/)
[![Gradle](https://img.shields.io/badge/Build-Gradle_KTS-blue.svg?style=for-the-badge&logo=gradle)](https://gradle.org/)
[![Min SDK](https://img.shields.io/badge/Min%20SDK-21%20%28Lollipop%29-brightgreen.svg?style=for-the-badge&logo=android)](https://developer.android.com)
[![Target SDK](https://img.shields.io/badge/Target%20SDK-36-blueviolet.svg?style=for-the-badge&logo=android)](https://developer.android.com)

**App Inglés** es una aplicación móvil para Android diseñada para el aprendizaje interactivo y dinámico del idioma inglés, combinando **vocabulario visual**, **cuestionarios de evaluación**, **módulos matemáticos** y **perfil interactivo de usuario**.

---

## 📸 Vista Previa / Capturas de Pantalla

| 🏠 Menú Principal | 🎨 Vocabulario | ❓ Cuestionario | 🧮 Matemáticas |
| :---: | :---: | :---: | :---: |
| <img src="app/src/main/res/drawable/fondo.png" width="200" alt="Menú Principal"/> | <img src="app/src/main/res/drawable/paletacolores.png" width="200" alt="Vocabulario"/> | <img src="app/src/main/res/drawable/preguntaanimal.png" width="200" alt="Quiz"/> | <img src="app/src/main/res/drawable/calculadora.png" width="200" alt="Operaciones"/> |

> 💡 *Para ver el flujo dinámico, compila la app en Android Studio o ejecuta en un emulador/dispositivo real.*

---

## ✨ Características Principales

### 📚 1. Módulo de Vocabulario Interactivo
Aprende palabras fundamentales en inglés asociadas a imágenes coloridas e intuitivas:
- 🎨 **Colores (*Colors*):** Morado (*Purple*), Azul (*Blue*), Rojo (*Red*), Verde (*Green*), Naranja (*Orange*).
- 🐶 **Animales (*Animals*):** Vaca (*Cow*), Perro (*Dog*), Gato (*Cat*), Cerdo (*Pig*), Conejo (*Rabbit*).
- 🔤 **Vocales (*Vowels*):** A, E, I, O, U.
- 🍎 **Frutas (*Fruits*):** Mango, Fresa (*Strawberry*), Uva (*Grape*), Manzana (*Apple*), Banano (*Banana*).
- 🔢 **Números (*Numbers*):** Uno (*One*), Dos (*Two*), Tres (*Three*), Cuatro (*Four*), Cinco (*Five*).

### ❓ 2. Cuestionario & Quiz Evaluativo
Evalúa lo aprendido mediante preguntas interactivas con opciones visuales:
- Identificación de colores, animales, vocales, frutas y números.
- Retroalimentación inmediata y navegación entre preguntas.

### 🧮 3. Módulo de Matemáticas y Operaciones Básicas
Practica cálculo numérico dentro de la misma aplicación:
- ➕ **Suma**
- ➖ **Resta**
- ✖️ **Multiplicación**
- ➗ **División**

### 👤 4. Perfil y Datos Personales
- Formulario interactivo con campos de texto, selección de género, gustos/pasatiempos (Leer, Caminar, Jugar) y desplegable de ciudades de Colombia.

---

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java ☕
* **Plataforma:** Android Native (SDK Min: 21 | SDK Target: 36)
* **Arquitectura:** Activity-based con navegación por Intent
* **Diseño de Interfaz:** XML Layouts, Material Design & ConstraintLayout
* **Build System:** Gradle (Kotlin DSL - `build.gradle.kts`)

---

## 📂 Estructura del Proyecto

```text
AppIngles2/
 ├── app/
 │    ├── src/
 │    │    ├── main/
 │    │    │    ├── java/com/example/appingles/
 │    │    │    │    ├── MainActivity.java           # Pantalla de inicio / Splash
 │    │    │    │    ├── Menu_Principal.java         # Navegación principal
 │    │    │    │    ├── Menu.java                   # Menú de vocabulario
 │    │    │    │    ├── Colores.java                # Sección Colores
 │    │    │    │    ├── Animales.java               # Sección Animales
 │    │    │    │    ├── Vocales.java                # Sección Vocales
 │    │    │    │    ├── Frutas.java                 # Sección Frutas
 │    │    │    │    ├── Numeros.java                # Sección Números
 │    │    │    │    ├── Preguntas1.java...Pregunta5 # Cuestionarios del 1 al 5
 │    │    │    │    ├── Menu_Operaciones.java       # Menú de matemáticas
 │    │    │    │    ├── Sumar/Restar/Multiplicar/Dividir.java
 │    │    │    │    ├── Datos.java / Perfil.java    # Perfil del usuario
 │    │    │    ├── res/
 │    │    │    │    ├── layout/                     # Interfaces XML
 │    │    │    │    ├── drawable/                   # Imágenes e íconos
 │    │    │    │    └── values/                     # Strings, colores y estilos
 │    │    │    └── AndroidManifest.xml
 │    └── build.gradle.kts
 ├── build.gradle.kts
 ├── settings.gradle.kts
 └── README.md
```

---

## 🚀 Instalación y Ejecución

1. **Clonar o descargar el repositorio:**
   ```bash
   git clone https://github.com/tu-usuario/AppIngles2.git
   ```

2. **Abrir en Android Studio:**
   - Abre **Android Studio** (versión Iguana/Jellyfish/Ladybug o superior recomendada).
   - Selecciona `Open` y navega hasta la carpeta del proyecto.

3. **Sincronizar Gradle:**
   - Deja que Android Studio descargue las dependencias mediante el botón **Gradle Sync**.

4. **Ejecutar la App:**
   - Conecta un dispositivo físico con Depuración USB habilitada o inicia un Emulador Android (AVD).
   - Presiona `Shift + F10` o haz clic en el botón verde **Run (▶)**.

---

## 🤝 Contribuciones

¡Las contribuciones, sugerencias y mejoras son bienvenidas!
1. Haz un **Fork** del proyecto.
2. Crea una rama para tu nueva funcionalidad (`git checkout -b feature/NuevaFuncionalidad`).
3. Realiza tus cambios y haz Commit (`git commit -m 'Añade nueva funcionalidad'`).
4. Haz Push a la rama (`git push origin feature/NuevaFuncionalidad`).
5. Abre un **Pull Request**.

---

## 📝 Licencia

Este proyecto está bajo la Licencia MIT - consulta el archivo [LICENSE](LICENSE) para más detalles.

---
<p align="center">
  Hecho con ❤️ para facilitar el aprendizaje de inglés.
</p>
