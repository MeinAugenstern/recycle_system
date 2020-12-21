<template>
    <div id="all-map" class="map">

    </div>
</template>

<script>
  import AMap from 'AMap'
  export default {
    mounted(){

      this.GaodeMap()

    },
    methods: {
      GaodeMap () {

        var map = new AMap.Map('all-map', {

          center: [116.397428, 39.90923], // [纬度，经度]

          resizeEnable: true,

          zoom: 10

        });

        AMap.plugin(['AMap.ToolBar', 'AMap.Scale'], function () {

          map.addControl(new AMap.ToolBar())

          map.addControl(new AMap.Scale())

        })

      }
    }
  }
</script>

<style scoped>
  .map{
    width: 600px;
    height: 600px;
  }
</style>
