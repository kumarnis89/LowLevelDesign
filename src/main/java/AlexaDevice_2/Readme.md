# Amazon Alexa Device - Low Level Design

## 📌 Overview
Design a flexible system for various Alexa devices (Echo Dot, Echo Show) that handles diverse hardware capabilities like audio, screens, and power management (Battery vs. Plug-in).

## 🏗️ Design Patterns Used
* **Strategy Pattern:** Encapsulated `IBattery` and `ChargeBehaviour` to allow runtime swapping of hardware logic.
* **Factory Pattern:** Centralized device creation in `AlexaDeviceFactory` to decouple client code from concrete implementations.
* **Null Object Pattern:** Implemented `NoBattery` to handle non-portable devices without `null` checks.
* **Interface Segregation:** Split `IAudio` and `IScreen` so devices only implement what they actually support.

## 🚀 Key SDE 2 Features
* **Encapsulation:** No downcasting in tests; state updates are handled via delegated methods in the `AlexaDevice` base class.
* **Scalability:** Parameterized factory prevents "Enum Explosion."
* **Persistence Ready:** Includes DTOs and API design for fleet-scale telemetry.