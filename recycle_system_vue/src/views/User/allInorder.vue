<template>
  <div>

    <el-table :data="tableData">
      <el-table-column prop="recycleOrderId" label="订单号" width="140">
      </el-table-column>
      <el-table-column prop="scheduledTime" label="预约时间" width="300">
      </el-table-column>
      <el-table-column  label="完成时间" width="300">
        <template slot-scope="scope">
          <span v-if="scope.row.finishedTime!=null">{{scope.row.finishedTime}}</span>
          <span v-else>未完成</span>
        </template>
      </el-table-column>
      <el-table-column prop="collectorName" label="配送员" width="140">
      </el-table-column>
      <el-table-column prop="phone" label="联系电话" >
      </el-table-column>
      <el-table-column fixed="right" label="操作">
        <template slot-scope="scope">
          <el-popover placement="right" width="300" trigger="click">
            <el-table :data="scope.row.recycleOrdersDetailVoList">
              <el-table-column width="100" prop="itemName" label="物品"></el-table-column>
              <el-table-column width="100" prop="quantity" label="数量"></el-table-column>
              <el-table-column width="100" prop="itemPrice" label="单价"></el-table-column>
            </el-table>
            <el-button  type="primary" round slot="reference" >查询订单详情</el-button>
          </el-popover>
        </template>
      </el-table-column>
    </el-table>
    <el-pagination
      background
      layout="prev, pager, next"
      :page-size="pageSize"
      :total="total"
      @current-change="page">
    </el-pagination>
  </div>
</template>

<script>
  export default {
    methods:{
      page(currentPage){
        const _this = this
        axios.get('http://localhost:8181/userAllorders/'+_this.$store.getters.getUserId+'/'+currentPage+'/2').then(function(resp){
          console.log(resp)
          _this.tableData = resp.data.list
          _this.pageSize = resp.data.pageSize
          _this.total = resp.data.total
        })
      }
    },
    created () {
      const _this=this;
      axios.get('http://localhost:8181/userAllorders/'+_this.$store.getters.getUserId+'/1/2').then(function (resp) {
        console.log(resp)
        _this.tableData=resp.data.list
        _this.pageSize = resp.data.pageSize
        _this.total = resp.data.total
      })
    },
    data(){
      return{
        pageSize:1,
        total:1,
        tableData: [{
          recycleOrderId: 1,
          scheduledTime: '12月15日 下午17：00',
          finishedTime:'12月15日 下午17：10',
          collectorName: '陈南',
          phone:13615787610,
          recycleOrdersDetailVoList:[{
            itemName: '纸板',
            quantity: '10KG',
            itemPrice: '1元/KG',
          }, {
            itemName: '易拉罐',
            quantity: '20个',
            itemPrice: '0.1元/个',
          }, {
            itemName: '啤酒瓶',
            quantity: '5个',
            itemPrice: '1元/个',
          }, {
            itemName: '旧衣服',
            quantity: '20KG',
            itemPrice: '0.5元/KG',
          }]
        }, {
          recycleOrderId: 2,
          scheduledTime: '12月15日 下午17：00',
          finishedTime:'12月15日 下午17：10',
          collectorName: '陈南',
          phone:13615787610,
          perform:[{
            itemName: '纸板',
            quantity: '10KG',
            itemPrice: '1元/KG',
          }, {
            itemName: '易拉罐',
            quantity: '20个',
            itemPrice: '0.1元/个',
          }, {
            itemName: '啤酒瓶',
            quantity: '5个',
            itemPrice: '1元/个',
          }, {
            itemName: '旧衣服',
            quantity: '20KG',
            itemPrice: '0.5元/KG',
          }]
        }]
      }
    }
  }
</script>

<style scoped>

</style>
