// src/org/demo/buildUtils.groovy
package org.conf

def showIt(task) {
  sh "echo ${task}"
  sh "./resources/first.sh"
}
