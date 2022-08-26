def call (Map args = [:]) {
  switch (env.PROJECT_TYPE) {
    case "maven":
      return qualityCheckMaven(args)

    default:
      echo "${env.PROJECT_TYPE} projects are not supported"
  }
}

def qualityCheckMaven(Map args = [:]) {
  libraryPath = args.get("libraryPath", "target/*.jar")
  commandLine = args.get("commandLine", "sonar:sonar -Dsonar.java.libraries=${libraryPath}")

  withSonarQubeEnv("SonarQube") {
    executeMavenCommand(commandLine)
  }
}
