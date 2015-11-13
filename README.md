# spark-wordcount

### Usage

**Step 1:** Download [Cloudera Quick Start VM][1]. It ships with Spark 1.2.

**Step 2:** Run the VM and open the terminal and execute command to launch **Cloudera Manager** and start all the services including spark:
```sudo /home/cloudera/cloudera-manager --force```

**Step 3:** Check if **Spark** is running, open the browser window and click on Spark(already bookmarked for you) and select the Master. It will list all the worker and application (if any) running on workers.

**Step 4:** Import project as a Maven-Scala project and Run **[WordCount.scala][2]** as a Scala application.

[1]: http://www.cloudera.com/content/www/en-us/documentation/enterprise/latest/topics/cloudera_quickstart_vm.html
[2]: https://github.com/arpitaggarwal/spark-wordcount/blob/master/src/main/scala/com/test/WordCount.scala
