<template>
  <el-container style="height:700px; border: 1px solid #eee">
    <el-aside width="220px" style="background-color: rgb(238, 241, 246)">
      <el-menu :default-active="this.$route.path" router>
        <el-submenu index="1">
          <template slot="title">操作</template>
          <el-menu-item-group>
            <el-menu-item index="/recycle" >资源回收</el-menu-item>
            <el-menu-item index="/recycle" >资源捐赠</el-menu-item>
          </el-menu-item-group>
        </el-submenu>
        <el-submenu index="2">
          <template slot="title">查看订单</template>
          <el-menu-item-group>
            <el-menu-item index="/hisinorder" >查看历史订单</el-menu-item>
            <el-menu-item index="/doinginorder" >进行中订单</el-menu-item>
          </el-menu-item-group>
        </el-submenu>

        <el-submenu index="3">
          <template slot="title">设置</template>
          <el-menu-item-group>
            <el-menu-item index="/alterinfo">修改个人信息</el-menu-item>
            <el-menu-item index="/login" @click="d">退出登录</el-menu-item>
          </el-menu-item-group>
        </el-submenu>
      </el-menu>
    </el-aside>

    <el-container>
      <el-header style="text-align: right; font-size: 12px">
        <span>{{this.$store.getters.getUserId}}</span>
      </el-header>
      <el-main>
        <router-view/>
      </el-main>

    </el-container>
  </el-container>


</template>
<script>
  export default {
    methods:{
      d(){
        this.$store.commit('setUserId',null)
      }
    }
  }
</script>

<style scoped>
  .el-header {
    background-color: #B3C0D1;
    color: #333;
    line-height: 60px;
  }

  .el-aside {
    color: #333;
  }
</style>
