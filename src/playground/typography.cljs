(ns playground.typography)

(defn subheader
  [size label]
  [(keyword size) {:class "subheader"} label])

(defn small-segment
  [size label]
  [(keyword size) {:class "small"} label])