# Project Name: S1.01. InheritancePolymorphism

Brief description of the project and its purpose.

## 📚 Exercise 1

In a music band, there are different types of musical instruments. These include wind, string, and percussion instruments.

All instruments have attributes such as `name` and `price`. Additionally, they have a method called `play()`. This method is abstract in the `Instrument` class and must therefore be implemented in the child classes.

- If a wind instrument is played, the method should display:  
  `"A wind instrument is playing"`
- If a string instrument is played:  
  `"A string instrument is playing"`
- If a percussion instrument is played:  
  `"A percussion instrument is playing"`

The class loading process only occurs once. Demonstrate that class loading can be triggered by either creating the first instance of the class or accessing a static member of it.

> 🔍 Research static blocks and initialization blocks in Java.

## 🛻 Exercise 2

Create a class called `Car` with the following attributes: `brand`, `model`, and `power`.

- `brand` should be `static final`
- `model` should be `static`
- `power` should be `final`

Demonstrate the difference between these three. Which of them can be initialized via the class constructor?

Add two methods to the `Car` class:

- A static method called `brake()`
- A non-static method called `accelerate()`

Demonstrate how to invoke both the static and non-static methods from the `main()` method in the main class.

---

## 💻 Technologies Used

- [Technology/Library] (e.g., React, Node.js, etc.)
- [Other Technology] (e.g., Express, MongoDB, etc.)
- [Tool/Framework] (e.g., Bootstrap, Docker, etc.)

## 📋 Requirements

- Minimum required [software] version: [Version] (e.g., Node.js >= 14.0.0)
- Dependencies: (e.g., `npm install`, list of necessary libraries)
- Compatible operating systems: (e.g., Windows, macOS, Linux)

## 🛠️ Installation

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/username/repository.git
