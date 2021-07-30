(ns reagent-material-ui.icons.drive-file-rename-outline-rounded
  "Imports @material-ui/icons/DriveFileRenameOutlineRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def drive-file-rename-outline-rounded (create-svg-icon (e "path" #js {"d" "m15 16-4 4h8c1.1 0 2-.9 2-2s-.9-2-2-2h-4zm-2.94-8.81-8.77 8.77c-.18.18-.29.44-.29.7V19c0 .55.45 1 1 1h2.34c.27 0 .52-.11.71-.29l8.77-8.77-3.76-3.75zm6.65.85c.39-.39.39-1.02 0-1.41l-2.34-2.34a.9959.9959 0 0 0-1.41 0l-1.83 1.83 3.75 3.75 1.83-1.83z"})
                                                        "DriveFileRenameOutlineRounded"))
