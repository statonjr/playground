(defproject playground "0.1.0-SNAPSHOT"
            :description "FIXME: write this!"
            :url "http://example.com/FIXME"

            :dependencies [[org.clojure/clojure "1.6.0"]
                           [org.clojure/clojurescript "0.0-2371"]
                           [reagent "0.4.3"]]

            :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]

            :source-paths ["src"]

            :cljsbuild {
                        :builds [{:id "playground"
                                  :source-paths ["src"]
                                  :compiler {
                                             :preamble ["reagent/react.js"]
                                             :output-to "target/playground.js"
                                             :output-dir "out"}}]})
