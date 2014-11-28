(ns playground.magellan)

(defn section
  [label]
  [:dd {:data-magellan-arrival label}
   [:a {:href (str "#" label)} label]])

(defn magellan
  [& sections]
  [:h1#magellan {:data-magellan-destination "magellan"} "Magellan"]
  [:div {:data-magellan-expedition "fixed"}
   [:dl.sub-nav
    [:dd {:data-magellan-arrival "top"}
     [:a {:href "top"}
      [:i.icon-home]]]
    (map #(section %) sections)]])