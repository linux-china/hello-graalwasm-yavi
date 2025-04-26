Hello GraalWasm
=======================

Build Java into WebAssembly using GraalWasm.

# Plain Java to WebAssembly

```shell
mkdir -p dist
javac -d dist src/main/java/HelloWasm.java
cd dist; native-image --tool:svm-wasm HelloWasm
node dist/helloWasm.js
```

# References

* GraalWasm: https://www.graalvm.org/webassembly/
* GraalWasm Documentation: https://www.graalvm.org/webassembly/docs/
* Wasm(WebAssembly) with Java and
  GraalVM: https://senoritadeveloper.medium.com/wasm-webassembly-with-java-and-graalvm-326e16afd348
* The Future of Write Once, Run Anywhere: From Java to WebAssembly: https://www.youtube.com/watch?v=Z2SWSIThHXY