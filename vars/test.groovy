def call (String commandLine = "", String reportsPath = "") {
  switch (env.PROJECT_TYPE) {
    case "maven":
      return testMaven(commandLine, reportsPath)

    default:
      echo "${env.PROJECT_TYPE} projects are not supported"
  }
}

def testMaven(String commandLine = "", String reportsPath = "") {
  commandLine = commandLine != "" ? commandLine : "test"

  executeMavenCommand(commandLine)

  return saveJUnitTestResults(reportsPath)
}
