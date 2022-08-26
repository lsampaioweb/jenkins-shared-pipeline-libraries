def call (String reportsPath = "") {
  reportsPath = reportsPath != "" ? reportsPath : "target/surefire-reports/*.xml"

  junit reportsPath
}
