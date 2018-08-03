(ns user
  "Initial namespace loaded when using a REPL (e.g. using `clj`)."
  (:require
            [clojure.java.io :as io]
            [clojure.java.shell :as shell]
            [clojure.pprint :refer :all]
            [clojure.reflect :as reflect]
            [clojure.repl :refer :all]
            [clojure.spec.alpha :as s]
            [clojure.spec.test.alpha :as stest]
            [clojure.string :as string]

            [cheshire.core :as json]
            [figwheel.main :as fig]

            [glu.core :refer :all]
            [glu.fsreload :as fsreload]
            [glu.logging :refer :all]
            [glu.repl :as repl]
            [glu.results :refer :all]

            [fileworthy.app :as app]
            [fileworthy.main :as cli]
            [fileworthy.core.users :as users]
            [fileworthy.web.server :as server]))

(defonce _
  (log :info "To start figwheel run `(start-figwheel)`"))

(defn start-figwheel
  []
  (fig/start "dev"))