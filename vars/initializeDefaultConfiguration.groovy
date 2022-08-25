def call () {
  currentBuild.displayName = currentBuild.number + " - " + getCommitAuthor()
  currentBuild.description = getCommitMessage()
}
