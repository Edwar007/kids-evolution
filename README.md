
# 🧠📱 Kids Evolution - App Educativa para Aprender Inglés

**Kids Evolution** es una aplicación móvil educativa desarrollada en **Kotlin para Android**, orientada al aprendizaje del idioma inglés en niños. Fue creada como parte de un proyecto universitario con el propósito de reforzar vocabulario básico mediante juegos interactivos y divertidos.

La app está conectada con **Firebase** para la gestión de usuarios (registro, login, autenticación y almacenamiento de datos).

---

## 🎮 ¿En qué consiste?

La aplicación cuenta con un juego de **memoria por parejas**, en el cual los niños deben emparejar imágenes que están ocultas boca abajo. Cada vez que una imagen es revelada, se pronuncia su nombre en inglés para reforzar la asociación visual y auditiva del vocabulario.

### 🧩 Modos de juego disponibles

- 🍎 **Frutas**
- 🐶 **Animales**
- 🪑 **Objetos del hogar**

### 🗣️ Ejemplo de interacción:

1. El niño toca una carta y se muestra una imagen (por ejemplo, una mesa).
2. La aplicación pronuncia el nombre de esa imagen en inglés (ej: _"table"_).
3. El niño debe encontrar su pareja en el tablero.
4. El juego continúa hasta emparejar todas las cartas.

---

## 🔐 Funcionalidades adicionales

- Registro y login de usuarios con **Firebase Authentication**.
- Almacenamiento de progreso del usuario con **Firebase Realtime Database** o **Firestore**.
- Diseño visual adaptado para niños.
- Refuerzo auditivo con pronunciación en inglés al presionar cada imagen.

---

## 🛠️ Tecnologías Utilizadas

- 📱 Kotlin (Android)
- ☁️ Firebase Authentication & Database
- 🖼️ Android Views, ImageButtons, y recursos multimedia (audio e imágenes)
- 🎨 Material Design para interfaces intuitivas

---

## ▶️ Instalación y ejecución

### Requisitos

- Android Studio instalado (versión 2022.1 o superior recomendada)
- Kotlin configurado
- Conexión a una cuenta de Firebase
- Dispositivo Android físico o emulador

### Pasos para correr la app:

1. **Clona el repositorio**

```bash
git clone https://github.com/tuusuario/kids-evolution.git
