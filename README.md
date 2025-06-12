# Android App – Rohit Singh

This is a **learning project** developed as part of my exploration into modern Android development using **Kotlin**, **Material Design**, and UI best practices. The app is designed as a personal contact page — showcasing developer profile information, a brief bio, and useful links like email, GitHub, and X (Twitter).

---

## Project Goals

- Practice Android UI design with a clean and stylish layout
- Implement dark mode, custom styles, and responsive views
- Use modern Android components like `ShapeableImageView`, `ScrollView`, and `Material Buttons`
- Understand layout management, resource handling, and linking activities

---

## Technologies & Tools Used

| Tool / Library              | Purpose                                  |
|----------------------------|------------------------------------------|
| Kotlin                     | Programming language                     |
| Android Studio             | IDE for development                      |
| Material Components        | UI components (buttons, image views etc.)|
| ShapeableImageView         | For rounded profile image                |
| ScrollView, LinearLayout   | Layout management                        |
| Intent & URI               | Opening external links                   |

---

## Features

- Clean and minimal dark-themed UI
- Circular profile image with background blur simulation
- Contact icons for Email, GitHub, and X (Twitter)
- Buttons to explore work or book a session
- Adaptive layout with scroll view for small devices

---

## Getting Started

### Prerequisites
- Android Studio (latest version)
- Android SDK 34 (or update as needed)
- Kotlin plugin enabled

### 🧾 Setup Instructions

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Rohit-Singh-07/SimpleAboutApp.git
   cd SimpleAboutApp


2. **Open in Android Studio**

  - Open Android Studio.

  - Go to File → Open.

  - Select the cloned folder.

  - Let Gradle sync.

  - If prompted, install any required SDK versions or tools.

3. **Run the App**

   - Connect your device with USB Debugging enabled, or start an emulator.

   - Click the green ▶️ Run button.

   - The app will launch on your selected device.
  
### Project Structure

```bash
  app/
├── java/com/example/first/MainActivity.kt
├── res/
│   ├── layout/activity_main.xml
│   ├── drawable/          # profile images, icons
│   ├── values/themes.xml  # dark mode & colors
├── AndroidManifest.xml

