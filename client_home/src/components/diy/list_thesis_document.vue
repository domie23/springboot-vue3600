<template>
	<div class="diy_home diy_list diy_thesis_document" id="diy_thesis_document_list">
		<!-- 列表 -->
		<div class="diy_view_list list list-x" v-if="show">
			<router-link class="diy_card goods diy_list_box_wrap" v-for="(o, i) in list" :key="i"
				:to="'/thesis_document/details?thesis_document_id=' + o['thesis_document_id']">
				<!-- 图片 -->
				<div class="diy_list_img_box" v-if="imgList.length" >
					<div class="diy_row" v-for="(item,index) in imgList" :key="item+index" v-show="$check_field('get',item.name,'/thesis_document/details') && +item.is_img_list">
						<div class="diy_title diy_list_img_title">
							<span>{{item.title}}:</span>
						</div>
						<div class="diy_field diy_img">
							<img :src="$fullUrl(o[item.name])" style="width:100%;height:100%" />
						</div>
					</div>
				</div>
				<!-- 内容 -->
				<div class="diy_list_item_box">
					<div class="diy_list_item_content" v-for="(item,index) in showItemList" :key="item+index">
						<div class="diy_row" :class="{[item.name]:true}" v-if="$check_field('get',item.name,'/thesis_document/details') && +item.is_img_list">
							<div class="diy_title">
								<span>{{item.title}}:</span>
							</div>
							<div class="diy_field diy_text">
								<span v-if="item.type == 'UID'" v-text="get_user_name(o[item.name])"></span>
								<span v-else-if="item.type == '日期'" v-text="$toTime(o[item.name],'yyyy-MM-dd')"></span>
								<span v-else-if="item.type == '时间'" v-text="$toTime(o[item.name],'hh:mm:ss')"></span>
								<span v-else-if="item.type == '日长'" v-text="$toTime(o[item.name],'yyyy-MM-dd hh:mm:ss')"></span>
								<span v-else v-text="o[item.name]"></span>
							</div>
						</div>
					</div>
				</div>
			</router-link>
		</div>
		<!-- 表格 -->
		<div class="diy_view_table" v-else>
			<table class="diy_table">
				<tr class="diy_row">
						<th class="diy_title" v-if="$check_field('get','student_information')">
						学生信息
					</th>
							<th class="diy_title" v-if="$check_field('get','student_id')">
						学生学号
					</th>
							<th class="diy_title" v-if="$check_field('get','student_name')">
						学生姓名
					</th>
							<th class="diy_title" v-if="$check_field('get','class_name')">
						班级名称
					</th>
							<th class="diy_title" v-if="$check_field('get','tutor_information')">
						导师信息
					</th>
							<th class="diy_title" v-if="$check_field('get','tutor_id')">
						导师工号
					</th>
							<th class="diy_title" v-if="$check_field('get','tutor_name')">
						导师姓名
					</th>
							<th class="diy_title" v-if="$check_field('get','thesis_title')">
						论文题目
					</th>
							<th class="diy_title" v-if="$check_field('get','document_type')">
						文档类型
					</th>
							</tr>
				<tr class="diy_row" v-for="(o,i) in list" :key="o+i">
						<td class="diy_field diy_uid" v-if="$check_field('get','student_information')">
						<span>
							{{ get_user_name(o['student_information']) }}
						</span>
					</td>
							<td class="diy_field diy_text" v-if="$check_field('get','student_id')">
						<span>
							{{ o["student_id"] }}
						</span>
					</td>
							<td class="diy_field diy_text" v-if="$check_field('get','student_name')">
						<span>
							{{ o["student_name"] }}
						</span>
					</td>
							<td class="diy_field diy_text" v-if="$check_field('get','class_name')">
						<span>
							{{ o["class_name"] }}
						</span>
					</td>
							<td class="diy_field diy_uid" v-if="$check_field('get','tutor_information')">
						<span>
							{{ get_user_name(o['tutor_information']) }}
						</span>
					</td>
							<td class="diy_field diy_text" v-if="$check_field('get','tutor_id')">
						<span>
							{{ o["tutor_id"] }}
						</span>
					</td>
							<td class="diy_field diy_text" v-if="$check_field('get','tutor_name')">
						<span>
							{{ o["tutor_name"] }}
						</span>
					</td>
							<td class="diy_field diy_text" v-if="$check_field('get','thesis_title')">
						<span>
							{{ o["thesis_title"] }}
						</span>
					</td>
							<td class="diy_field diy_text" v-if="$check_field('get','document_type')">
						<span>
							{{ o["document_type"] }}
						</span>
					</td>
							</tr>
			</table>
		</div>
	</div>
</template>

<script>
	export default {
		props: {
			list: {
				type: Array,
				default: function() {
					return [];
				},
			},
			show: {
				type: Boolean,
				default: function(){
					return true;
				}
			}
		},
		data() {
			return {
						imgList: [
						],
						itemList: [
								{
									title: "学生信息",
									name: "student_information",
									type: "UID",
									is_img_list: "0"
								},
								{
									title: "学生学号",
									name: "student_id",
									type: "文本",
									is_img_list: "0"
								},
								{
									title: "学生姓名",
									name: "student_name",
									type: "文本",
									is_img_list: "0"
								},
								{
									title: "班级名称",
									name: "class_name",
									type: "文本",
									is_img_list: "0"
								},
								{
									title: "导师信息",
									name: "tutor_information",
									type: "UID",
									is_img_list: "0"
								},
								{
									title: "导师工号",
									name: "tutor_id",
									type: "文本",
									is_img_list: "0"
								},
								{
									title: "导师姓名",
									name: "tutor_name",
									type: "文本",
									is_img_list: "0"
								},
								{
									title: "论文题目",
									name: "thesis_title",
									type: "文本",
									is_img_list: "0"
								},
								{
									title: "文档类型",
									name: "document_type",
									type: "下拉",
									is_img_list: "0"
								},
								{
									title: "上传文档",
									name: "upload_document",
									type: "文件",
									is_img_list: "0"
								},
						],
						richList: [
						],
					// 用户列表
				list_user_student_information: [],
									// 用户列表
				list_user_tutor_information: [],
									};
		},
		methods: {
				/**
			 * 获取学生用户用户列表
			 */
			async get_list_user_student_information() {
				var json = await this.$get("~/api/user/get_list?user_group=学生用户");
				if(json.result && json.result.list){
					this.list_user_student_information = json.result.list;
				}
				else if(json.error){
					console.error(json.error);
				}
			},
			get_user_name(id){
				var obj = this.list_user_student_information.getObj({"user_id":id});
				var ret = "";
				if(obj){
					ret = obj.nickname+"-"+obj.username;
					// if(obj.nickname){
					// 	ret = obj.nickname;
					// }
					// else{
					// 	ret = obj.username;
					// }
				}
				return ret;
			},
								/**
			 * 获取导师用户用户列表
			 */
			async get_list_user_tutor_information() {
				var json = await this.$get("~/api/user/get_list?user_group=导师用户");
				if(json.result && json.result.list){
					this.list_user_tutor_information = json.result.list;
				}
				else if(json.error){
					console.error(json.error);
				}
			},
			get_user_name(id){
				var obj = this.list_user_tutor_information.getObj({"user_id":id});
				var ret = "";
				if(obj){
					ret = obj.nickname+"-"+obj.username;
					// if(obj.nickname){
					// 	ret = obj.nickname;
					// }
					// else{
					// 	ret = obj.username;
					// }
				}
				return ret;
			},
								},
		created() {
				this.get_list_user_student_information();
								this.get_list_user_tutor_information();
								},
		computed:{
			showItemList(){
				let arr = [];
				let _type = ["视频","音频","文件"];
				this.itemList.forEach(item => {
					if(_type.indexOf(item.type) === -1 && !!+item.is_img_list){
						arr.push(item)
					}
				})
				return arr.slice(0,4);
			}
		}
	};
</script>

<style scoped>
	.media {
		display: flex;
		flex-direction: column;
		justify-content: space-between;
		flex-basis: 75%;
		min-height: 10rem;
	}

	.goods {
		display: flex;
		width: calc(25% - 1rem);
		margin: 0.5rem;
		padding: 0.5rem;
		flex-direction: column;
		justify-content: space-between;
		background-color: white;
		border-radius: 0.5rem;
	}

	.goods:hover {
		border: 0.2rem solid #909399;
		box-shadow: 0 0.1rem 0.3rem rgba(0, 0, 0, 0.15);
	}

	.goods:hover img {
		filter: blur(1px);
	}

	.price {
		font-size: 1rem;
		margin-right: 3px;
	}

	.price_ago {
		text-decoration: line-through;
		font-size: 0.5rem;
		color: #999;

	}

	.title {
		word-break: break-all;
		overflow: hidden;
		text-overflow: ellipsis;
		white-space: nowrap;
		font-weight: 700;
		padding: .25rem;
	}

	.icon_cart {
		color: #FF5722;
		float: right;
	}

	@media (max-width: 992px) {

		.goods {
			width: calc(33% - 1rem);
			;
		}

	}

	@media (max-width: 768px) {

		.goods {
			width: calc(50% - 1rem);
			;
		}

	}
</style>

