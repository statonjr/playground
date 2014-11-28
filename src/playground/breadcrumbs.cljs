(ns playground.breadcrumbs)

(defn crumb
  [label]
  [:li
   [:a {:href "#"} label]])

(defn breadcrumbs
  "Creates breadcrumbs from list of labels"
  [labels]
  [:ul.breadcrumbs
   (map #(crumb %) labels)])

