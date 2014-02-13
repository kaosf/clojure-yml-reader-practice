(ns yml-reader-practice.core
  (:require [clj-yaml.core :as yaml]
            [clojure.pprint :refer (pprint)])
  (:gen-class))

(defn -main
  "Read YAML file and print out prettily!"
  [yml-filepath]
  (pprint
    (yaml/parse-string
      (slurp yml-filepath))))
