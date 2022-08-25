def call(String script, boolean returnStdout = false) {
  if(isUnix()) {
    return sh(script: script, returnStdout: returnStdout)
  } else {
    return bat(script: script, returnStdout: returnStdout)
  }
}
