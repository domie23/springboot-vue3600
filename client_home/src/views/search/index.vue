<template>
  <div class="page_search">
	<div class="warp">
	  <div class="container">
		<div class="row">
		  <div class="col-12">
			<div class="card_result_search">
			  <div class="title">搜索结果</div>

				<!-- 文章搜索结果 -->
			  <list_result_search
				:list="result_article"
				title="校园资讯"
				source_table="article"
			  ></list_result_search>


						  <list_result_search
				v-if="$check_action('/tutor_user/list', 'get')"
				:list="result_tutor_user_tutor_id"
				title="导师用户导师工号"
				source_table="tutor_user"
			  ></list_result_search>
								  <list_result_search
				v-if="$check_action('/tutor_user/list', 'get')"
				:list="result_tutor_user_tutor_name"
				title="导师用户导师姓名"
				source_table="tutor_user"
			  ></list_result_search>
															  <list_result_search
				v-if="$check_action('/student_users/list', 'get')"
				:list="result_student_users_student_id"
				title="学生用户学生学号"
				source_table="student_users"
			  ></list_result_search>
								  <list_result_search
				v-if="$check_action('/student_users/list', 'get')"
				:list="result_student_users_student_name"
				title="学生用户学生姓名"
				source_table="student_users"
			  ></list_result_search>
											  <list_result_search
				v-if="$check_action('/student_users/list', 'get')"
				:list="result_student_users_class_name"
				title="学生用户班级名称"
				source_table="student_users"
			  ></list_result_search>
												  <list_result_search
				v-if="$check_action('/thesis_title/list', 'get')"
				:list="result_thesis_title_tutor_id"
				title="论文题目导师工号"
				source_table="thesis_title"
			  ></list_result_search>
								  <list_result_search
				v-if="$check_action('/thesis_title/list', 'get')"
				:list="result_thesis_title_tutor_name"
				title="论文题目导师姓名"
				source_table="thesis_title"
			  ></list_result_search>
																					  <list_result_search
				v-if="$check_action('/thesis_document/list', 'get')"
				:list="result_thesis_document_student_id"
				title="论文文档学生学号"
				source_table="thesis_document"
			  ></list_result_search>
								  <list_result_search
				v-if="$check_action('/thesis_document/list', 'get')"
				:list="result_thesis_document_student_name"
				title="论文文档学生姓名"
				source_table="thesis_document"
			  ></list_result_search>
																				  <list_result_search
				v-if="$check_action('/thesis_document/list', 'get')"
				:list="result_thesis_document_thesis_title"
				title="论文文档论文题目"
				source_table="thesis_document"
			  ></list_result_search>
								  <list_result_search
				v-if="$check_action('/thesis_document/list', 'get')"
				:list="result_thesis_document_document_type"
				title="论文文档文档类型"
				source_table="thesis_document"
			  ></list_result_search>
															  <list_result_search
				v-if="$check_action('/thesis_guidance/list', 'get')"
				:list="result_thesis_guidance_student_id"
				title="论文指导学生学号"
				source_table="thesis_guidance"
			  ></list_result_search>
								  <list_result_search
				v-if="$check_action('/thesis_guidance/list', 'get')"
				:list="result_thesis_guidance_student_name"
				title="论文指导学生姓名"
				source_table="thesis_guidance"
			  ></list_result_search>
																				  <list_result_search
				v-if="$check_action('/thesis_guidance/list', 'get')"
				:list="result_thesis_guidance_thesis_title"
				title="论文指导论文题目"
				source_table="thesis_guidance"
			  ></list_result_search>
								  <list_result_search
				v-if="$check_action('/thesis_guidance/list', 'get')"
				:list="result_thesis_guidance_document_type"
				title="论文指导文档类型"
				source_table="thesis_guidance"
			  ></list_result_search>
																		  <list_result_search
				v-if="$check_action('/thesis_score/list', 'get')"
				:list="result_thesis_score_student_id"
				title="论文成绩学生学号"
				source_table="thesis_score"
			  ></list_result_search>
								  <list_result_search
				v-if="$check_action('/thesis_score/list', 'get')"
				:list="result_thesis_score_student_name"
				title="论文成绩学生姓名"
				source_table="thesis_score"
			  ></list_result_search>
																				  <list_result_search
				v-if="$check_action('/thesis_score/list', 'get')"
				:list="result_thesis_score_thesis_title"
				title="论文成绩论文题目"
				source_table="thesis_score"
			  ></list_result_search>
																		  <list_result_search
				v-if="$check_action('/tutor_answers_questions/list', 'get')"
				:list="result_tutor_answers_questions_student_id"
				title="导师答疑学生学号"
				source_table="tutor_answers_questions"
			  ></list_result_search>
								  <list_result_search
				v-if="$check_action('/tutor_answers_questions/list', 'get')"
				:list="result_tutor_answers_questions_student_name"
				title="导师答疑学生姓名"
				source_table="tutor_answers_questions"
			  ></list_result_search>
																				  <list_result_search
				v-if="$check_action('/tutor_answers_questions/list', 'get')"
				:list="result_tutor_answers_questions_thesis_title"
				title="导师答疑论文题目"
				source_table="tutor_answers_questions"
			  ></list_result_search>
																		  <list_result_search
				v-if="$check_action('/review_defense/list', 'get')"
				:list="result_review_defense_student_id"
				title="评审答辩学生学号"
				source_table="review_defense"
			  ></list_result_search>
								  <list_result_search
				v-if="$check_action('/review_defense/list', 'get')"
				:list="result_review_defense_student_name"
				title="评审答辩学生姓名"
				source_table="review_defense"
			  ></list_result_search>
											  <list_result_search
				v-if="$check_action('/review_defense/list', 'get')"
				:list="result_review_defense_thesis_title"
				title="评审答辩论文题目"
				source_table="review_defense"
			  ></list_result_search>
														  <list_result_search
				v-if="$check_action('/review_defense/list', 'get')"
				:list="result_review_defense_defense"
				title="评审答辩答辩情况"
				source_table="review_defense"
			  ></list_result_search>
						</div>
		  </div>
		</div>
	  </div>
	</div>
  </div>
</template>

<script>
import mixin from "../../mixins/page.js";
import list_result_search from "../../components/diy/list_result_search.vue";

export default {
  mixins: [mixin],
  data() {
	return {
	  "query": {
		word: "",
	  },
	  "result_article": [],
						"result_tutor_user_tutor_id":[],
								"result_tutor_user_tutor_name":[],
															"result_student_users_student_id":[],
								"result_student_users_student_name":[],
											"result_student_users_class_name":[],
												"result_thesis_title_tutor_id":[],
								"result_thesis_title_tutor_name":[],
																					"result_thesis_document_student_id":[],
								"result_thesis_document_student_name":[],
																				"result_thesis_document_thesis_title":[],
								"result_thesis_document_document_type":[],
															"result_thesis_guidance_student_id":[],
								"result_thesis_guidance_student_name":[],
																				"result_thesis_guidance_thesis_title":[],
								"result_thesis_guidance_document_type":[],
																		"result_thesis_score_student_id":[],
								"result_thesis_score_student_name":[],
																				"result_thesis_score_thesis_title":[],
																		"result_tutor_answers_questions_student_id":[],
								"result_tutor_answers_questions_student_name":[],
																				"result_tutor_answers_questions_thesis_title":[],
																		"result_review_defense_student_id":[],
								"result_review_defense_student_name":[],
											"result_review_defense_thesis_title":[],
														"result_review_defense_defense":[],
				};
  },
  methods: {
	/**
	 * 获取文章
	 */
	get_article() {
	  this.$get("~/api/article/get_list?like=0", { page: 1, size: 10, title: this.query.word }, (json) => {
		if (json.result) {
		  this.result_article = json.result.list;
		}
	  });
	},

				/**
	 * 获取tutor_id
	 */
	get_tutor_user_tutor_id(){
		this.$get("~/api/tutor_user/get_list?like=0", { page: 1, size: 10, "tutor_id": this.query.word }, (json) => {
		  if (json.result) {
			var result_tutor_user_tutor_id = json.result.list;
			result_tutor_user_tutor_id.map(o => o.title = o['tutor_id'])
	  			this.result_tutor_user_tutor_id = result_tutor_user_tutor_id
		 	}
		});
	},
						/**
	 * 获取tutor_name
	 */
	get_tutor_user_tutor_name(){
		this.$get("~/api/tutor_user/get_list?like=0", { page: 1, size: 10, "tutor_name": this.query.word }, (json) => {
		  if (json.result) {
			var result_tutor_user_tutor_name = json.result.list;
			result_tutor_user_tutor_name.map(o => o.title = o['tutor_name'])
	  			this.result_tutor_user_tutor_name = result_tutor_user_tutor_name
		 	}
		});
	},
													/**
	 * 获取student_id
	 */
	get_student_users_student_id(){
		this.$get("~/api/student_users/get_list?like=0", { page: 1, size: 10, "student_id": this.query.word }, (json) => {
		  if (json.result) {
			var result_student_users_student_id = json.result.list;
			result_student_users_student_id.map(o => o.title = o['student_id'])
	  			this.result_student_users_student_id = result_student_users_student_id
		 	}
		});
	},
						/**
	 * 获取student_name
	 */
	get_student_users_student_name(){
		this.$get("~/api/student_users/get_list?like=0", { page: 1, size: 10, "student_name": this.query.word }, (json) => {
		  if (json.result) {
			var result_student_users_student_name = json.result.list;
			result_student_users_student_name.map(o => o.title = o['student_name'])
	  			this.result_student_users_student_name = result_student_users_student_name
		 	}
		});
	},
									/**
	 * 获取class_name
	 */
	get_student_users_class_name(){
		this.$get("~/api/student_users/get_list?like=0", { page: 1, size: 10, "class_name": this.query.word }, (json) => {
		  if (json.result) {
			var result_student_users_class_name = json.result.list;
			result_student_users_class_name.map(o => o.title = o['class_name'])
	  			this.result_student_users_class_name = result_student_users_class_name
		 	}
		});
	},
										/**
	 * 获取tutor_id
	 */
	get_thesis_title_tutor_id(){
		this.$get("~/api/thesis_title/get_list?like=0", { page: 1, size: 10, "tutor_id": this.query.word }, (json) => {
		  if (json.result) {
			var result_thesis_title_tutor_id = json.result.list;
			result_thesis_title_tutor_id.map(o => o.title = o['tutor_id'])
	  			this.result_thesis_title_tutor_id = result_thesis_title_tutor_id
		 	}
		});
	},
						/**
	 * 获取tutor_name
	 */
	get_thesis_title_tutor_name(){
		this.$get("~/api/thesis_title/get_list?like=0", { page: 1, size: 10, "tutor_name": this.query.word }, (json) => {
		  if (json.result) {
			var result_thesis_title_tutor_name = json.result.list;
			result_thesis_title_tutor_name.map(o => o.title = o['tutor_name'])
	  			this.result_thesis_title_tutor_name = result_thesis_title_tutor_name
		 	}
		});
	},
																			/**
	 * 获取student_id
	 */
	get_thesis_document_student_id(){
		this.$get("~/api/thesis_document/get_list?like=0", { page: 1, size: 10, "student_id": this.query.word }, (json) => {
		  if (json.result) {
			var result_thesis_document_student_id = json.result.list;
			result_thesis_document_student_id.map(o => o.title = o['student_id'])
	  			this.result_thesis_document_student_id = result_thesis_document_student_id
		 	}
		});
	},
						/**
	 * 获取student_name
	 */
	get_thesis_document_student_name(){
		this.$get("~/api/thesis_document/get_list?like=0", { page: 1, size: 10, "student_name": this.query.word }, (json) => {
		  if (json.result) {
			var result_thesis_document_student_name = json.result.list;
			result_thesis_document_student_name.map(o => o.title = o['student_name'])
	  			this.result_thesis_document_student_name = result_thesis_document_student_name
		 	}
		});
	},
																		/**
	 * 获取thesis_title
	 */
	get_thesis_document_thesis_title(){
		this.$get("~/api/thesis_document/get_list?like=0", { page: 1, size: 10, "thesis_title": this.query.word }, (json) => {
		  if (json.result) {
			var result_thesis_document_thesis_title = json.result.list;
			result_thesis_document_thesis_title.map(o => o.title = o['thesis_title'])
	  			this.result_thesis_document_thesis_title = result_thesis_document_thesis_title
		 	}
		});
	},
						/**
	 * 获取document_type
	 */
	get_thesis_document_document_type(){
		this.$get("~/api/thesis_document/get_list?like=0", { page: 1, size: 10, "document_type": this.query.word }, (json) => {
		  if (json.result) {
			var result_thesis_document_document_type = json.result.list;
			result_thesis_document_document_type.map(o => o.title = o['document_type'])
	  			this.result_thesis_document_document_type = result_thesis_document_document_type
		 	}
		});
	},
													/**
	 * 获取student_id
	 */
	get_thesis_guidance_student_id(){
		this.$get("~/api/thesis_guidance/get_list?like=0", { page: 1, size: 10, "student_id": this.query.word }, (json) => {
		  if (json.result) {
			var result_thesis_guidance_student_id = json.result.list;
			result_thesis_guidance_student_id.map(o => o.title = o['student_id'])
	  			this.result_thesis_guidance_student_id = result_thesis_guidance_student_id
		 	}
		});
	},
						/**
	 * 获取student_name
	 */
	get_thesis_guidance_student_name(){
		this.$get("~/api/thesis_guidance/get_list?like=0", { page: 1, size: 10, "student_name": this.query.word }, (json) => {
		  if (json.result) {
			var result_thesis_guidance_student_name = json.result.list;
			result_thesis_guidance_student_name.map(o => o.title = o['student_name'])
	  			this.result_thesis_guidance_student_name = result_thesis_guidance_student_name
		 	}
		});
	},
																		/**
	 * 获取thesis_title
	 */
	get_thesis_guidance_thesis_title(){
		this.$get("~/api/thesis_guidance/get_list?like=0", { page: 1, size: 10, "thesis_title": this.query.word }, (json) => {
		  if (json.result) {
			var result_thesis_guidance_thesis_title = json.result.list;
			result_thesis_guidance_thesis_title.map(o => o.title = o['thesis_title'])
	  			this.result_thesis_guidance_thesis_title = result_thesis_guidance_thesis_title
		 	}
		});
	},
						/**
	 * 获取document_type
	 */
	get_thesis_guidance_document_type(){
		this.$get("~/api/thesis_guidance/get_list?like=0", { page: 1, size: 10, "document_type": this.query.word }, (json) => {
		  if (json.result) {
			var result_thesis_guidance_document_type = json.result.list;
			result_thesis_guidance_document_type.map(o => o.title = o['document_type'])
	  			this.result_thesis_guidance_document_type = result_thesis_guidance_document_type
		 	}
		});
	},
																/**
	 * 获取student_id
	 */
	get_thesis_score_student_id(){
		this.$get("~/api/thesis_score/get_list?like=0", { page: 1, size: 10, "student_id": this.query.word }, (json) => {
		  if (json.result) {
			var result_thesis_score_student_id = json.result.list;
			result_thesis_score_student_id.map(o => o.title = o['student_id'])
	  			this.result_thesis_score_student_id = result_thesis_score_student_id
		 	}
		});
	},
						/**
	 * 获取student_name
	 */
	get_thesis_score_student_name(){
		this.$get("~/api/thesis_score/get_list?like=0", { page: 1, size: 10, "student_name": this.query.word }, (json) => {
		  if (json.result) {
			var result_thesis_score_student_name = json.result.list;
			result_thesis_score_student_name.map(o => o.title = o['student_name'])
	  			this.result_thesis_score_student_name = result_thesis_score_student_name
		 	}
		});
	},
																		/**
	 * 获取thesis_title
	 */
	get_thesis_score_thesis_title(){
		this.$get("~/api/thesis_score/get_list?like=0", { page: 1, size: 10, "thesis_title": this.query.word }, (json) => {
		  if (json.result) {
			var result_thesis_score_thesis_title = json.result.list;
			result_thesis_score_thesis_title.map(o => o.title = o['thesis_title'])
	  			this.result_thesis_score_thesis_title = result_thesis_score_thesis_title
		 	}
		});
	},
																/**
	 * 获取student_id
	 */
	get_tutor_answers_questions_student_id(){
		this.$get("~/api/tutor_answers_questions/get_list?like=0", { page: 1, size: 10, "student_id": this.query.word }, (json) => {
		  if (json.result) {
			var result_tutor_answers_questions_student_id = json.result.list;
			result_tutor_answers_questions_student_id.map(o => o.title = o['student_id'])
	  			this.result_tutor_answers_questions_student_id = result_tutor_answers_questions_student_id
		 	}
		});
	},
						/**
	 * 获取student_name
	 */
	get_tutor_answers_questions_student_name(){
		this.$get("~/api/tutor_answers_questions/get_list?like=0", { page: 1, size: 10, "student_name": this.query.word }, (json) => {
		  if (json.result) {
			var result_tutor_answers_questions_student_name = json.result.list;
			result_tutor_answers_questions_student_name.map(o => o.title = o['student_name'])
	  			this.result_tutor_answers_questions_student_name = result_tutor_answers_questions_student_name
		 	}
		});
	},
																		/**
	 * 获取thesis_title
	 */
	get_tutor_answers_questions_thesis_title(){
		this.$get("~/api/tutor_answers_questions/get_list?like=0", { page: 1, size: 10, "thesis_title": this.query.word }, (json) => {
		  if (json.result) {
			var result_tutor_answers_questions_thesis_title = json.result.list;
			result_tutor_answers_questions_thesis_title.map(o => o.title = o['thesis_title'])
	  			this.result_tutor_answers_questions_thesis_title = result_tutor_answers_questions_thesis_title
		 	}
		});
	},
																/**
	 * 获取student_id
	 */
	get_review_defense_student_id(){
		this.$get("~/api/review_defense/get_list?like=0", { page: 1, size: 10, "student_id": this.query.word }, (json) => {
		  if (json.result) {
			var result_review_defense_student_id = json.result.list;
			result_review_defense_student_id.map(o => o.title = o['student_id'])
	  			this.result_review_defense_student_id = result_review_defense_student_id
		 	}
		});
	},
						/**
	 * 获取student_name
	 */
	get_review_defense_student_name(){
		this.$get("~/api/review_defense/get_list?like=0", { page: 1, size: 10, "student_name": this.query.word }, (json) => {
		  if (json.result) {
			var result_review_defense_student_name = json.result.list;
			result_review_defense_student_name.map(o => o.title = o['student_name'])
	  			this.result_review_defense_student_name = result_review_defense_student_name
		 	}
		});
	},
									/**
	 * 获取thesis_title
	 */
	get_review_defense_thesis_title(){
		this.$get("~/api/review_defense/get_list?like=0", { page: 1, size: 10, "thesis_title": this.query.word }, (json) => {
		  if (json.result) {
			var result_review_defense_thesis_title = json.result.list;
			result_review_defense_thesis_title.map(o => o.title = o['thesis_title'])
	  			this.result_review_defense_thesis_title = result_review_defense_thesis_title
		 	}
		});
	},
												/**
	 * 获取defense
	 */
	get_review_defense_defense(){
		this.$get("~/api/review_defense/get_list?like=0", { page: 1, size: 10, "defense": this.query.word }, (json) => {
		  if (json.result) {
			var result_review_defense_defense = json.result.list;
			result_review_defense_defense.map(o => o.title = o['defense'])
	  			this.result_review_defense_defense = result_review_defense_defense
		 	}
		});
	},
			
  },
  components: { list_result_search },
	created(){
    this.query.word = this.$route.query.word || "";
  },
  mounted() {
	this.get_article();
					this.get_tutor_user_tutor_id();
							this.get_tutor_user_tutor_name();
														this.get_student_users_student_id();
							this.get_student_users_student_name();
										this.get_student_users_class_name();
											this.get_thesis_title_tutor_id();
							this.get_thesis_title_tutor_name();
																				this.get_thesis_document_student_id();
							this.get_thesis_document_student_name();
																			this.get_thesis_document_thesis_title();
							this.get_thesis_document_document_type();
														this.get_thesis_guidance_student_id();
							this.get_thesis_guidance_student_name();
																			this.get_thesis_guidance_thesis_title();
							this.get_thesis_guidance_document_type();
																	this.get_thesis_score_student_id();
							this.get_thesis_score_student_name();
																			this.get_thesis_score_thesis_title();
																	this.get_tutor_answers_questions_student_id();
							this.get_tutor_answers_questions_student_name();
																			this.get_tutor_answers_questions_thesis_title();
																	this.get_review_defense_student_id();
							this.get_review_defense_student_name();
										this.get_review_defense_thesis_title();
													this.get_review_defense_defense();
			  },
  watch: {
	$route() {
	  $.push(this.query, this.$route.query);
	  this.get_article();
				  this.get_tutor_user_tutor_id();
						  this.get_tutor_user_tutor_name();
													  this.get_student_users_student_id();
						  this.get_student_users_student_name();
									  this.get_student_users_class_name();
										  this.get_thesis_title_tutor_id();
						  this.get_thesis_title_tutor_name();
																			  this.get_thesis_document_student_id();
						  this.get_thesis_document_student_name();
																		  this.get_thesis_document_thesis_title();
						  this.get_thesis_document_document_type();
													  this.get_thesis_guidance_student_id();
						  this.get_thesis_guidance_student_name();
																		  this.get_thesis_guidance_thesis_title();
						  this.get_thesis_guidance_document_type();
																  this.get_thesis_score_student_id();
						  this.get_thesis_score_student_name();
																		  this.get_thesis_score_thesis_title();
																  this.get_tutor_answers_questions_student_id();
						  this.get_tutor_answers_questions_student_name();
																		  this.get_tutor_answers_questions_thesis_title();
																  this.get_review_defense_student_id();
						  this.get_review_defense_student_name();
									  this.get_review_defense_thesis_title();
												  this.get_review_defense_defense();
				},
  },
};
</script>

<style scoped>
.card_search {
  text-align: center;
}
.card_result_search>.title {
  text-align: center;
  padding: 10px 0;
}
</style>
