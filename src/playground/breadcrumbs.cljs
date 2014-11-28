(ns playground.breadcrumbs)

(defn crumb
  [label]
  [:li {:key label}
   [:a {:href "#"} label]])

(defn breadcrumbs
  "Creates breadcrumbs from list of labels"
  [labels]
  [:ul.breadcrumbs
   (map #(crumb %) labels)])

