(ns playground.buttons)

(defn basic-button
  "Defines a button with LABEL and TYPE"
  [label type]
  [:a.button {:class type :href "#"} label])

;; TODO: Figure out how to create these
(defn icon-button
  "Defines an icon button with LABEL and TYPE"
  [label type]
  [:a.button {:class type :href "#"}
   [:i.icon-home] label])