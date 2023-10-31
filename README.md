
# ASnack - Snackbar Library for Android
This library provides a lightweight and customizable Snackbar component for Android applications, based on the Snackbar implementation in AnkiDroid.
It offers a user-friendly interface for displaying brief messages at the bottom of the screen, serving as informative or actionable prompts for users.

## Features
- Easy integration with minimal configuration
- Customizable appearance and behavior to match your app's design
- Support for various durations including short and long display times
- Callback functionalities for handling user interactions with the Snackbar
- Accessibility support for users with diverse needs

## Installation
To integrate the Snackbar library into your Android project, simply add the library as a dependency in your project's build.gradle 
file. Ensure that you have the necessary Android SDK version compatible with the library.

### Step 1: Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```
* For `.kts`
  
```
 maven { url = uri("https://jitpack.io") }
```

### Step 2: Add the dependency
Tag is the latest release version

For `build.gradle`
```
dependencies {
	        implementation 'com.github.criticalAY:ASnack:Tag'
	}
```

For `build.gradle.kts`
```
implementation("com.github.criticalAY:ASnack:Tag")
```

## Usage
1. Initialize the Snackbar component within your activity or fragment.


## Working 
* You can create snackbars by calling `showSnackbar` on either an activity or a view. As `CoordinatorLayout` is responsible for proper placement and animation of snackbars,
if calling on an activity, the activity **MUST** have a `CoordinatorLayout` with id `root_layout`; if calling on a view, the view **MUST** be either a `CoordinatorLayout`,
or a (possibly indirect) child of `CoordinatorLayout`. Any additional configuration can be done in the configuration block, e.g.

```
     showSnackbar(text) {
         addCallback(callback)
     }
```

* The activity that is the receiver must have a `CoordinatorLayout` with id 'root_layout'
* `snackbarBuilder` is  Optional.

## Credits
This library is a derivative work based on the Snackbar component extracted from AnkiDroid, an open-source Android flashcard application. We acknowledge and appreciate the work done by [AnkiDroid](https://github.com/ankidroid/Anki-Android) 
team in developing the original Snackbar implementation.


