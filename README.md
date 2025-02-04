# Demo Google Maps

This demo app makes use of [our custom fork of the Capacitor plugin for Google Maps](https://github.com/LaravelFreelancerNL/capacitor-google-maps) to show a map with a tile overlay and the user's current location.

## Getting Started

### Pre-requisites

- [Node.js (>=20)](https://nodejs.org/en/download)
- [Ionic CLI](https://ionicframework.com/docs/intro/cli#install-the-ionic-cli)
- [Xcode](https://developer.apple.com/xcode/)
- [CocoaPods](https://cocoapods.org/)
- [Android Studio](https://developer.android.com/studio)

### Building

```bash
# Clone
git clone --recursive https://github.com/LaravelFreelancerNL/capacitor-google-maps-demo.git

# Setup dotenv
cd capacitor-google-maps-demo
cp .env.example .env # Fill all values in .env

# Install dependencies
npm i

# Build
npm run build
```

### Running

```bash
npm run run:web
npm run run:ios
npm run run:android
```

### Helpful scripts

```bash
# Open native projects
npm run open:ios
npm run open:android
```
