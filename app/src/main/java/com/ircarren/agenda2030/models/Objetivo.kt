package com.ircarren.agenda2030.models

data class Objetivo(var titulo: String,
                    var descripcion_corta: String,
                    var descripcion_larga: String,
                    var datos: java.util.ArrayList<String>,
                    var metas: java.util.ArrayList<String>,
                    var informacion: java.util.ArrayList<String>,
                    var imagen: Int,
                    )
