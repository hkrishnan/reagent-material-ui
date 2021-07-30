(ns reagent-material-ui.icons.import-export-outlined
  "Imports @material-ui/icons/ImportExportOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def import-export-outlined (create-svg-icon (e "path" #js {"d" "M9 3 5 6.99h3V14h2V6.99h3L9 3zm7 14.01V10h-2v7.01h-3L15 21l4-3.99h-3z"})
                                             "ImportExportOutlined"))
