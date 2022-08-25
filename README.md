# Jenkins Shared Pipeline Libraries

A repository for all the shared libraries created to be used during the build of the projects using JenkinsFiles.

The src directory should look like standard Java source directory structure. This directory is added to the classpath when executing Pipelines.

The vars directory stores script files that are exposed as a variable in Pipelines. The name of the file is the name of the variable in the Pipeline. So if you have a file called vars/log.groovy with a function like def info(message)…​ in it, you can access this function like log.info "hello world" in the Pipeline. You can put as many functions as you like inside this file. Read  below for more examples and options.

A resources directory allows the libraryResource step to be used from an external library to load associated non-Groovy files. Currently this feature is not supported for internal libraries.

These libraries are considered "trusted:" they can run any methods in Java, Groovy, Jenkins internal APIs, Jenkins plugins, or third-party libraries. This allows you to define libraries which encapsulate individually unsafe APIs in a higher-level wrapper safe for use from any Pipeline. Beware that anyone able to push commits to this SCM repository could obtain unlimited access to Jenkins.

IMPORTANT: The "_" at the end of the line is necessary. 

``` bash
@Library('my-shared-library') _

// Using a version specifier, such as branch, tag, etc.
@Library('my-shared-library@1.0') _

// Accessing multiple libraries with one statement.
@Library(['my-shared-library', 'otherlib@abc1234']) _
```

# License:

[MIT](LICENSE "MIT License")

# Created by: 

1. Luciano Sampaio.
