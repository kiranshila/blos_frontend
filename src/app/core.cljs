(ns app.core
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]))

(def header (r/atom "Hello frank"))

(defn app []
  [:div
   [:h1 {:style {:color "blue"}} @header]])

(defn ^:dev/after-load start []
  (.log js/console "Starting app")
  (rdom/render [app] (.getElementById js/document "app")))

(defn ^:export main []
  (start))
