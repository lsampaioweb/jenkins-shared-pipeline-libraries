def call () {
  return trimOutput(executeCommand("git log --format=\'%aN\' -n 1 HEAD", true), 80)
}
