build:
  ./mvnw clean package
  ls -la target/hello-graalwasm*

run:
  node target/hello-graalwasm.js

clean:
  ./mvnw clean

setup:
  brew install binaryen
  sdk install java 24-graal
  sdk install java 25.ea.18-graal