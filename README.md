
# RCT Bridge Logger

Allows react-native to print to the native logs from Javascript.

## Usage
```javascript
import RNRctLogger from 'react-native-rctbridge-logger';
...
RNRctLogger.log('TAG', 'This is a message from react-native')
```

```bash
> adb logcat | grep TAG
02-01 14:51:22.114 22397 22517 V RNRctLogger: TAG This is a message from react-native
```

## Getting started

`$ npm install react-native-rctbridge-logger --save`

### Mostly automatic installation

`$ react-native link react-native-rctbridge-logger`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-rctbridge-logger` and add `RNRctLogger.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNRctLogger.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.connectedlab.RNRctLoggerPackage;` to the imports at the top of the file
  - Add `new RNRctLoggerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-rctbridge-logger'
  	project(':react-native-rctbridge-logger').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-rctbridge-logger/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-rctbridge-logger')
  	```