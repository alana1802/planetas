plugins {
    id( " com.android.application " )
    id( " kotlin-android " )
    // O plugin Flutter Gradle deve ser aplicado depois dos plugins Gradle para Android e Kotlin.
    id( " dev.flutter.flutter-gradle-plugin " )
}

andróide {
    namespace =  " com.example.myapp "
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

    compileOpções {
        sourceCompatibility =  JavaVersion . VERSION_1_8
        targetCompatibility =  JavaVersion . VERSION_1_8
    }

    Opções kotlin {
        jvmTarget =  JavaVersion . VERSION_1_8 .toString()
    }

    configuração padrão {
        // TODO: Especifique seu próprio ID de aplicativo exclusivo (https://developer.android.com/studio/build/application-id.html).
        applicationId =  " com.example.myapp "
        // Você pode atualizar os seguintes valores para atender às necessidades do seu aplicativo.
        // Para mais informações, consulte: https://flutter.dev/to/review-gradle-config.
        minSdk = flutter.minSdkVersão
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    tipos de construção {
        liberar {
            // TODO: adicione sua própria configuração de assinatura para a compilação de lançamento.
            // Assinando as chaves de depuração por enquanto, então `flutter run --release` funciona.
            signingConfig = signingConfigs.getByName( " depurar " )
        }
    }
}

vibração {
    fonte =  " ../.. "
}
