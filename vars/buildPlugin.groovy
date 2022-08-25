def call (String commandLine = "") {
  switch (env.PROJECT_TYPE) {
    case "maven":
      return buildMaven(commandLine)

    default:
      echo "${env.PROJECT_TYPE} projects are not supported"
  }
}

def buildMaven(String commandLine = "") {
  commandLine = commandLine != "" ? commandLine : "-DskipTests clean package"

  return executeMavenCommand("-B $commandLine")
}
