# Hello GraalWasm

```
sdk list java # check the latest graalvm 25
sdk install java 25.ea.18-graal
sdk use java 25.ea.18-graal
```

```
brew install binaryen
```

```
./mvnw clean package
```

```
$ ls -la target/hello-graalwasm*
-rw-r--r--@ 1 toshiaki  staff       4942 Apr 23 17:48 target/hello-graalwasm-1.0-SNAPSHOT.jar
-rw-r--r--@ 1 toshiaki  staff      94524 Apr 23 17:48 target/hello-graalwasm.js
-rw-r--r--@ 1 toshiaki  staff    6478667 Apr 23 17:48 target/hello-graalwasm.js.wasm
-rw-r--r--@ 1 toshiaki  staff  108304691 Apr 23 17:48 target/hello-graalwasm.js.wat
```

```
$ node target/hello-graalwasm.js
Car creation failed!
"seatCount" must be greater than or equal to 2
```