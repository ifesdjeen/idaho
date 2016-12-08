(defproject ifesdjeen/idaho "0.0.1-SNAPSHOT"
  :min-lein-version  "2.5.1"
  :description       "CQL DSL for Clojure"
  :license           {:name "Eclipse Public License"
                      :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies      [[org.clojure/clojure                          "1..0"]
                      [com.datastax.cassandra/cassandra-driver-core "3.0.1"]
                      [com.datastax.cassandra/cassandra-driver-dse  "3.0.0-beta1"]
                      [org.clojure/core.match                       "0.3.0-alpha4"]]
  :aot [ifesdjeen.idaho]
  :source-paths      ["src/clj"]
  :test-paths        ["test/clj" "test/java"]
  :java-source-paths ["test/java" "src/java"]
  :repositories      {"sonatype" {:url       "http://oss.sonatype.org/content/repositories/releases"
                                  :snapshots false
                                  :releases  {:checksum :fail :update :always}}
                      "sonatype-snapshots" {:url       "http://oss.sonatype.org/content/repositories/snapshots"
                                            :snapshots true
                                            :releases  {:checksum :fail :update :always}}}
  :global-vars       {*warn-on-reflection* true}
  )
