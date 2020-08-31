(defproject bpindelski/maximator "0.2.0-SNAPSHOT"

  :description "Thin Clojure wrapper around MaxMind GeoIP2 for IP geolocalization"
  :url "https://github.com/bpindelski/maximator"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :min-lein-version "2.0.0"

  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.maxmind.geoip2/geoip2 "2.14.0"]
                 [gavagai "0.3.2"]]

  :plugins [[lein-codox "0.10.7"]]

  :codox {:src-dir-uri               "https://github.com/bpindelski/maximator/blob/v0.2.0/"
          :src-linenum-anchor-prefix "L"
          :defaults                  {:doc/format :markdown}})
