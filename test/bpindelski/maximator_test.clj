(ns com.bpindelski.maximator-test
  (:require [clojure.test :refer :all]
            [com.bpindelski.maximator :refer :all]))

(def loc (make-locator "test/GeoLite2-Country.mmdb" :locales [:en]))

(deftest a-test
  (println (lookup loc "8.8.8.8"))
  (testing "FIXME, I fail."
    (is (= 0 1))))
