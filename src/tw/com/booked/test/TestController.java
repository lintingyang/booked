package tw.com.booked.test;

public class TestController {

//	private Logger log = LoggerFactory.getLogger(this.getClass());
//
//	@Autowired
//	private ChatService chatService;
//
//	@RequestMapping(value = "/list", method = RequestMethod.GET)
//	public String listPage() {
//		return "/test/testList";
//	}
//
//	@RequestMapping(value = "/add", method = RequestMethod.GET)
//	public String addPage() {
//		return "/test/testAdd";
//	}

	// @RequestMapping(value = "/insert")
	// @ResponseBody
	// public AjaxResponse<Chat> insert(final Model model, @RequestParam("id")
	// Integer id,
	// @RequestParam("message") String message) {
	//
	// final AjaxResponse<Chat> response = new AjaxResponse<Chat>();
	// log.debug("^^^^^^^^^^^^^^^^^^^^^^^^^^" + id);
	// try {
	// if (response.isMessagesEmpty()) {
	// Chat chat = chatService.postChat(id, message);
	// response.setData(chat);
	// }
	// } catch (final Exception e) {
	// response.addException(e);
	// }
	// return response;
	// }
//
//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	public String editPage(@PathVariable("id") final int id, final Model model) {
//
//		Chat role = chatService.getOne(id);
//		model.addAttribute("entity", role);
//
//		return "/test/testEdit";
//	}
//
//	@RequestMapping(method = RequestMethod.GET)
//	@ResponseBody
//	public GridResponse<Chat> query(final Model model, final Chat chat, final Pageable pageable) {
//
//		Page<Chat> page;
//		log.debug("dfadsfdsaf= "+pageable);
//		log.debug("fdasfdas="+chat);
//		try {
//			final List<CommonCriterion> criterions = new ArrayList<CommonCriterion>();
//
//			if (StringUtils.isNotEmpty(chat.getMessages())) {
//				log.debug("********chatkuklukliuklukyl=" );
//				criterions.add(new CommonCriterion(QueryOpType.LIKE, "messages", "%" + chat.getMessages() + "%"));
//			}
//
//			// if (StringUtils.isNotEmpty(form.getName())) {
//			// criterions.add(new CommonCriterion(QueryOpType.LIKE, "name", "%"
//			// + form.getName() + "%"));
//			// }
//
//			page = chatService.getByCondition(criterions, pageable);
//
//		} catch (final Exception e) {
//			return new GridResponse<Chat>(e);
//		}
//
//		return new GridResponse<Chat>(page);
//	}
//
//	@RequestMapping(method = RequestMethod.POST)
//	@ResponseBody
//	public AjaxResponse<Chat> insert(final Model model, @RequestBody final Chat form) {
//
//		final AjaxResponse<Chat> response = new AjaxResponse<Chat>();
//
//		try {
//
//			 if (StringUtils.isEmpty(form.getMessages())) {
//			 response.addMessage("messages", "訊息不得空白");
//			 }
//			
//			 if (form != null && form.getUser() == null) {
//			 log.debug("testestestestestset");
//				 response.addMessage("user.id", "名稱不得空白");
//			 }
//
//			if (response.isMessagesEmpty()) {
//
//				final Chat insertResult = chatService.insert(form);
//				response.setData(insertResult);
//			}
//		} catch (final Exception e) {
//			response.addException(e);
//		}
//		return response;
//	}
//
//	// @RequestMapping(method = RequestMethod.PUT)
//	// @ResponseBody
//	// public AjaxResponse<Chat> update(final Model model, @RequestParam("id")
//	// Integer id, @RequestParam("message") String message) {
//	//
//	// final AjaxResponse<Chat> response = new AjaxResponse<Chat>();
//	//
//	// try {
//	//// if (StringUtils.isEmpty(form.getName())) {
//	//// response.addMessage("name", "名稱不得空白");
//	//// }
//	//
//	//
//	// if (response.isMessagesEmpty()) {
//	// final Chat updateResult = chatService.update(id,message);
//	// response.setData(updateResult);
//	// }
//	// } catch (final Exception e) {
//	// response.addException(e);
//	// }
//	// return response;
//	// }
//
//	@RequestMapping(method = RequestMethod.PUT)
//	@ResponseBody
//	public AjaxResponse<Chat> update(final Model model, @RequestBody final Chat form) {
//		final AjaxResponse<Chat> response = new AjaxResponse<Chat>();
//
//		try {
//			// if (StringUtils.isEmpty(form.getName())) {
//			// response.addMessage("name", "名稱不得空白");
//			// }
//
//			if (response.isMessagesEmpty()) {
//				final Chat updateResult = chatService.update(form);
//				response.setData(updateResult);
//			}
//		} catch (final Exception e) {
//			response.addException(e);
//		}
//		return response;
//	}
//
//	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//	@ResponseBody
//	public AjaxResponse<Chat> delete(@PathVariable(value = "id") final int id) {
//		log.debug("{}", id);
//		final AjaxResponse<Chat> response = new AjaxResponse<Chat>();
//
//		try {
//			if (response.isMessagesEmpty()) {
//				chatService.delete(id);
//			}
//		} catch (final Exception e) {
//			return new AjaxResponse<>(e);
//		}
//		return response;
//	}

}
