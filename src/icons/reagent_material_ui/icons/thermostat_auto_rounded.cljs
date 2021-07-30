(ns reagent-material-ui.icons.thermostat-auto-rounded
  "Imports @material-ui/icons/ThermostatAutoRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def thermostat-auto-rounded (create-svg-icon (e "path" #js {"d" "M11 12V6c0-1.66-1.34-3-3-3S5 4.34 5 6v6c-1.21.91-2 2.37-2 4 0 1.12.38 2.14 1 2.97V19h.02c.91 1.21 2.35 2 3.98 2s3.06-.79 3.98-2H12v-.03c.62-.83 1-1.85 1-2.97 0-1.63-.79-3.09-2-4zm-6 4c0-.94.45-1.84 1.2-2.4L7 13V6c0-.55.45-1 1-1s1 .45 1 1v7l.8.6c.75.57 1.2 1.46 1.2 2.4H5zM17.81 4c-.48 0-.92.3-1.09.75L14 12.02c-.18.47.17.98.67.98.31 0 .58-.19.68-.48L16 10.7h3.63l.64 1.82c.1.29.38.48.68.48.51 0 .86-.51.68-.98L18.9 4.75c-.17-.45-.6-.75-1.09-.75zm-1.34 5.39 1.31-3.72h.08l1.31 3.72h-2.7z"})
                                              "ThermostatAutoRounded"))
