# **Detector de Desbloqueo y Llamada Automática**

Esta aplicación de Android desarrollada en Java ejecuta acciones automáticas en segundo plano al detectar el desbloqueo de la pantalla del dispositivo.

## **Descripción**

Este proyecto implementa un BroadcastReceiver para escuchar eventos del sistema operativo. Al detectar que el usuario ha desbloqueado la pantalla (Intent.ACTION_USER_PRESENT), la aplicación realiza tres acciones simultáneas:

* Muestra un mensaje informativo en pantalla mediante un Toast.
* Registra el evento de forma interna en el Logcat.
* Inicia automáticamente una llamada telefónica mediante un Intent implícito a un número predefinido.

## **Características técnicas**

* BroadcastReceiver: Registro dinámico del receptor de eventos dentro del ciclo de vida de la actividad principal para optimizar el uso de recursos.
* Intents Implícitos: Uso de Intent.ACTION_CALL para ejecutar llamadas directas desde la aplicación sin requerir interacción adicional del usuario.
* Gestión de Permisos: Implementación de solicitud de permisos en tiempo real (Runtime Permissions) para el acceso a la función de llamadas (CALL_PHONE), asegurando el cumplimiento de las políticas de seguridad de Android 6.0 y versiones superiores.

## **Tecnologías utilizadas**

Lenguaje: Java
Entorno: Android Studio

Control de Versiones: Git & GitHub

## **Instalación y uso**

Clonar el repositorio y abrir el proyecto en Android Studio.

Compilar e instalar la aplicación en un emulador o dispositivo físico.

Al iniciar la aplicación por primera vez, aceptar el permiso de gestión de llamadas solicitado en pantalla.

Bloquear el dispositivo.

Al desbloquear la pantalla, el sistema ejecutará la acción de llamada de forma automática.

###### Desarrollado por Débora Moyano como proyecto práctico para la materia programación de dispositivos móviles.